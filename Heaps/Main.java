import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(2);

        ArrayList list = heap.heapSort();
        System.out.println(list);
    }
}
