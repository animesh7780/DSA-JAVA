import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class NextGr8rFreq {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        // code here
        int n = arr.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        //fequency Map
        for(int x : arr){
            freq.put(x, freq.getOrDefault(x, 0)+1);
        }

        //Stack to store elements
        Stack<Integer> st = new Stack<>();

        for(int i=n-1; i>=0; i--){
            int curr = arr[i];

            while(!st.isEmpty() && freq.get(st.peek()) <= freq.get(curr)){
                st.pop();
            }

            if (st.isEmpty()) res.add(0, -1);
            else res.add(0, st.peek());
            
            st.push(curr);
        }
        return res;
    }
}
