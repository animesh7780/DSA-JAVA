import java.util.HashMap;

public class Leet1636 {
    public static void main(String[] args) {
        
    }
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int[] res = new int[nums.length];
        int index = 0;
        for(int key : map.keySet()){
            for(int i=0; i<map.get(key); i++){
                res[index++] = key;
            }
        }
        return res;
    }
}
