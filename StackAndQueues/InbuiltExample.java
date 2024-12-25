import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class InbuiltExample {
    public static void main(String[] args) {
        // Stack
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(34);
        stack.push(23);
        stack.push(45);
        stack.push(67);
        stack.push(89);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // Queue
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(34);
        queue.add(23);
        queue.add(45);
        queue.add(67);
        queue.add(89);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        // Deque

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(34);
        deque.add(23);
        deque.add(45);
        deque.add(67);
        deque.add(89);
        deque.addLast(45);
        deque.addFirst(23);

        System.out.println(deque.remove());
    }
}