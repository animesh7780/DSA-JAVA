import java.util.HashMap;

public class MAXFreq {
    int[] arr = {1, 2, 2, 31, 4, 4, 7, 8, 99, 12};
    HashMap<Integer, Integer> mp = new HashMap<>();
    
    // Constructor or method to count frequencies
    public MAXFreq() {
        getMaxFrequencyKey();
    }
    
    public int getMaxFrequencyKey() {
        mp.clear();
        int maxFreq = 0;
        int maxKey = arr[0]; // Initialize with first element
        
        for (int num : arr) {
            int newFreq = mp.getOrDefault(num, 0) + 1;
            mp.put(num, newFreq);
            
            // Update max frequency and corresponding key
            if (newFreq > maxFreq) {
                maxFreq = newFreq;
                maxKey = num;
            }
        }
        
        return maxKey;
    }
}
