import java.util.ArrayList;
import java.util.HashMap;

public class Leet347{
    public static void main(String[] args) {
        
    }
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList <Integer> res = new ArrayList<>();
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key)>k){
                res.add(key);
            }
        }
        return res;
    }
}