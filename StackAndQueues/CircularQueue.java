public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public CircularQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isfull() {
        return end == data.length;// ptr at last index
    }

    private boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isfull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() {
        if (isEmpty()) {
            return -1;
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() {
        if (isEmpty()) {
            return -1;
        }
        return data[front];
    }

    public void display() {
        for (int i = front; i < end; i++) {
            System.out.print(data[i] + "<-" + " ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        DynamicQueue queue = new DynamicQueue();
        queue.insert(34);
        queue.insert(23);
        queue.insert(45);
        queue.insert(67);
        queue.insert(89);
        queue.insert(89);
        queue.insert(89);
        queue.insert(89);
        queue.insert(89);
        queue.insert(89);
        queue.insert(89);
        queue.insert(89);
        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.display();
    }
}