import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

public class NGE{
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(n, -1));
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=2*n-1; i>=0; i--){
            int k = i%n;
            while(!dq.isEmpty() && dq.peek()<= arr[k]) dq.pop();
            if(i < n && !dq.isEmpty()) list.set(k, dq.peek());
            dq.push(arr[k]);
        }
        return list;
    }
}