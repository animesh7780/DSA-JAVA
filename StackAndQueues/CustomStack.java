public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 5;

    int ptr = -1;

    public CustomStack() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isfull()) {
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return data[ptr--];
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return data[ptr];
    }

    public boolean isfull() {
        return ptr == data.length - 1;// ptr at last index
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();
        stack.push(34);
        stack.push(23);
        stack.push(45);
        stack.push(67);
        stack.push(89);
        stack.push(89);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}