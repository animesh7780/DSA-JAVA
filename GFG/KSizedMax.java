import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class KSizedMax {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0; i<arr.length; i++){

            //removing the elements out of this window
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            //remove smaller elements 
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.pollLast();
            }

            //add max element in the dequeu
            dq.offerLast(i);

            //Add max for the window
            if(i >= k-1) ans.add(arr[dq.peekFirst()]);
        }
        return ans;
    }
}
