import java.util.ArrayList;
import java.util.HashMap;

public class Leet350 {
    public static void main(String[] args) {
        
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums1){
            map.put( num, map.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums2){
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);  // Add to result
                map.put(num, map.get(num) - 1);  // Decrement count in map
            }
        }
        int[] intersection = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intersection[i] = list.get(i);
        }
        
        return intersection;
    }
}
