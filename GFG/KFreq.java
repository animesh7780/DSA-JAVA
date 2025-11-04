import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KFreq {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);

        // Sort by frequency (high → low), then by value (high → low)
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue();  // higher frequency first
            } else {
                return b.getKey() - a.getKey();      // if tie, higher number first
            }
        });

        // Take top K elements
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < k && i < list.size(); i++) {
            result.add(list.get(i).getKey());
        }

        return result;
    }
}
