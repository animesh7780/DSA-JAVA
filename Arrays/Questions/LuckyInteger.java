import java.util.Hashtable;
import java.util.Map;

public class LuckyInteger {
    public int findLucky(int[] arr) {
        int n = arr.length;
        Hashtable<Integer, Integer> tb = new Hashtable<>();
        
        // First, build the complete frequency map
        for(int i = 0; i < n; i++){
            tb.put(arr[i], tb.getOrDefault(arr[i], 0) + 1);
        }
        
        // Then find the largest lucky number
        int maxLucky = -1;
        for(Map.Entry<Integer, Integer> entry : tb.entrySet()){
            int number = entry.getKey();
            int frequency = entry.getValue();
            
            if(number == frequency){
                maxLucky = Math.max(maxLucky, number);
            }
        }
        
        return maxLucky;
    }
}
