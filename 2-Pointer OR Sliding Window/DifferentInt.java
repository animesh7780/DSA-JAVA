import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DifferentInt {
    public static int findSubarraysWithKDistinct(int[] arr, int k) {
        int noOfSub = 0;

        for (int i = 0; i < arr.length; i++) {
            Set<Integer> distinct = new HashSet<>();
            
            for (int j = i; j < arr.length; j++) {
                distinct.add(arr[j]);
                
                if (distinct.size() == k) {
                    noOfSub++;
                } else if (distinct.size() > k) {
                    break;
                }
            }
        }
        
        return noOfSub;
    }

    public static int countSubarraysWithKDistinct(int[] arr, int k) {
        return countAtMostK(arr, k) - countAtMostK(arr, k - 1);
    }
    
    private static int countAtMostK(int[] arr, int k) {
        if (k == 0) return 0;
        
        Map<Integer, Integer> count = new HashMap<>();
        int left = 0, result = 0;
        
        for (int right = 0; right < arr.length; right++) {
            // Add current element
            count.put(arr[right], count.getOrDefault(arr[right], 0) + 1);
            
            // Shrink window if we have more than k distinct elements
            while (count.size() > k) {
                count.put(arr[left], count.get(arr[left]) - 1);
                if (count.get(arr[left]) == 0) {
                    count.remove(arr[left]);
                }
                left++;
            }
            
            // Add all subarrays ending at 'right' with at most k distinct elements
            result += right - left + 1;
        }
        
        return result;
    }
    
}
