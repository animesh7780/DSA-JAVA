import java.util.ArrayList;
import java.util.List;

public class OneDeletion {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        
        // Find minimum value correctly
        int min = arr[0];  // Initialize to first element, not Integer.MIN_VALUE
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        // Create subarray by removing first occurrence of minimum
        List<Integer> sub = new ArrayList<>();
        boolean removedOne = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == min && !removedOne) {
                removedOne = true;  // Skip first occurrence of minimum
                continue;
            }
            sub.add(arr[i]);
        }
        
        // Find maximum subarray sum in the remaining array
        return maxSumKadane(sub);
    }
    
    // Helper: Kadane's algorithm for maximum subarray sum
    private int maxSumKadane(List<Integer> arr) {
        if (arr.isEmpty()) return 0;
        
        int maxSoFar = arr.get(0);
        int maxEndingHere = arr.get(0);
        
        for (int i = 1; i < arr.size(); i++) {
            maxEndingHere = Math.max(arr.get(i), maxEndingHere + arr.get(i));
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }
}
