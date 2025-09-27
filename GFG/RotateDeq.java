import java.util.Deque;

public class RotateDeq {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // code here        
        if(type == 1){
            int i=0;
            while(i < k){
                int an = dq.removeLast();
                dq.addFirst(an);
                i++;
            }
        }
        else{
            int i=0;
            while(i < k){
                int an = dq.removeFirst();
                dq.addLast(an);
                i++;
            }
        }
    }
}
