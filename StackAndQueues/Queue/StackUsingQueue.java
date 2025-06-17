import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    
    // Constructor - Two Queue Approach
    public StackUsingQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
      if(q1.isEmpty()){
        return -1;
      }  
      while(!q1.isEmpty()){
        q2.offer(q1.poll());
      }

      int result = q1.poll();

      Queue<Integer> temp = q1;
      q1 = q2;
      q2 = temp;

      return result;
    }
    
    public int top() {
        if(q1.isEmpty()){
            return -1;
        }  
        
        // Move all elements except the last one to q2
        while(q1.size() > 1){
            q2.offer(q1.poll());
        }
        
        // Get the top element (don't remove it permanently)
        int top = q1.peek();  // or q1.poll()
        q2.offer(q1.poll());  // Move it to q2 as well
        
        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
