import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(767);
        list.add(767);
        list.add(767);
        // Adding an element at index 1
        list.add(1, 100);
        System.out.println(list);
    }
}
