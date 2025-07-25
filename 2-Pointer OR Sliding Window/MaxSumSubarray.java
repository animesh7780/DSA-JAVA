import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxSumSubarray {
    public int maxSumEfficient(int[] nums) {
        // Since we want to maximize sum with unique elements,
        // we should consider: for each possible set of unique values,
        // what's the maximum sum we can achieve?
        
        Set<Integer> uniqueValues = new HashSet<>();
        for (int num : nums) {
            uniqueValues.add(num);
        }
        
        int maxSum = Arrays.stream(nums).max().getAsInt();
        
        // Try all possible subsets of unique values
        List<Integer> values = new ArrayList<>(uniqueValues);
        int n = values.size();
        
        for (int mask = 1; mask < (1 << n); mask++) {
            List<Integer> selectedValues = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    selectedValues.add(values.get(i));
                }
            }
            
            // For these selected values, find if we can form a contiguous subarray
            // by arranging them optimally after deletions
            maxSum = Math.max(maxSum, selectedValues.stream().mapToInt(Integer::intValue).sum());
        }
        
        return maxSum;
    }
}
