import java.util.ArrayList;
import java.util.Stack;

public class StackSpan {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()) al.add(i + 1);

            else al.add(i - st.peek());

            st.push(i);
        }
        return al;
    }
}
