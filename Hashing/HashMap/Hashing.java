import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        // pairs key,values
        HashMap<String, Integer> map = new HashMap<>();

        // putting values in the map
        map.put("India", 120);
        map.put("USA", 100);
        map.put("UK", 50);
        map.put("China", 150);

        // printing the map

        map.put("India", 130);
        System.out.println(map);

        // search
        if (map.containsKey("China")) {
            System.out.println("China is present in the map");
        }

        System.out.println(map.get("India"));

        // iterate
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Set<String> keys = map.keySet();
        for (String el : keys) {
            System.out.println(el + " " + map.get(el));
        }

        // remove
        map.remove("China");
        System.out.println(map);
    }
}