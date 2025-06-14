import java.util.HashMap;

public class CountFrequencies {
    int[] arr = {1, 2, 2, 31, 4, 4, 7, 8, 99, 12};
    HashMap<Integer, Integer> mp = new HashMap<>();
    
    // Constructor or method to count frequencies
    public CountFrequencies() {
        countFrequencies();
    }
    
    public void countFrequencies() {
        for (int i = 0; i < arr.length; i++) { // Use arr.length instead of undefined 'n'
            int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key)) {
                freq = mp.get(key); // fetching from the map
            }
            freq++;
            mp.put(key, freq); // inserting into the map
        }
    }
}