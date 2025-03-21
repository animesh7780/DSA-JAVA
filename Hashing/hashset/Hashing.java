import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        // creating a HashSet
        HashSet<Integer> set = new HashSet<>();

        // inserting elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);

        // size
        System.out.println("Size: " + set.size());

        // print all elements

        System.out.println("Elements: " + set);

        // iterator
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // search - contains
        if (set.contains(10)) {
            System.out.println("10 is present");
        }
        if (!set.contains(40)) {
            System.out.println("40 is not present");
        }

        // delete - remove
        set.remove(10);
        if (!set.contains(10)) {
            System.out.println("10 is removed");
        }
    }
}