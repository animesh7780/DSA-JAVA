import java.util.LinkedList;

public class LinkedListQueue {
    private LinkedList<Integer> l1;

    public LinkedListQueue() {
        l1 = new LinkedList<>();
    }

    public void push(int x) {
       l1.addLast(x);
    }

    public int pop() {
      return l1.removeFirst();
    }

    public int peek() {
        return l1.getFirst();
    }

    public boolean isEmpty() {
        return l1.isEmpty();
    }
}
