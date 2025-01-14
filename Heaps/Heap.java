import java.util.*;

class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return 2 * index + 1;
    }

    private int right(int index) {
        return 2 * index + 2;
    }

    public void insert(T value) {
        list.add(value);
        upHeap(list.size() - 1);
    }

    private void upHeap(int index) {
        if (index == 0)
            return;
        int parent = parent(index);
        if (list.get(index).compareTo(list.get(parent)) < 0) {
            swap(index, parent);
            upHeap(parent);
        }
    }

    public T remove() {
        if (list.isEmpty())
            return null;
        T temp = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }

    private void downHeap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(left).compareTo(list.get(min)) < 0) {
            min = left;
        }

        if (right < list.size() && list.get(right).compareTo(list.get(min)) < 0) {
            min = right;
        }

        if (min != index) {
            swap(min, index);
            downHeap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()) {
            data.add(remove());
        }
        return data;
    }
}
