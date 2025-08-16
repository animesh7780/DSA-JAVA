import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFreqEle{
    public int[] topKFrequent(int[] nums, int k) {
        
        // 1. Frequency count
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        //2. sort them by frequency
        List<Map.Entry<Integer, Integer>> e = new ArrayList<>(freqMap.entrySet());
        e.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        //3. Print top k elements 
        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i] = e.get(i).getKey();
        }
        return res;
    }
}