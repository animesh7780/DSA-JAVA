import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Basic {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        System.out.println(map.containsKey("a"));

        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);

        System.out.println(set);

    }
}