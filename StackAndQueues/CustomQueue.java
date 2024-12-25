public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomQueue(int size) {
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
        return true;
    }

    public int remove() {
        if (isEmpty()) {
            return -1;
        }
        int removed = data[0];
        // shift elemnts to left
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() {
        if (isEmpty()) {
            return -1;
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + "<-" + " ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.insert(34);
        queue.insert(23);
        queue.insert(45);
        queue.insert(67);
        queue.insert(89);
        queue.insert(89);

        queue.display();
        System.out.println(queue.front());
    }
}
