import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }
}
