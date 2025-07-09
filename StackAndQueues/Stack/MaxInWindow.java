import java.util.ArrayDeque;
import java.util.Deque;

public class MaxInWindow {

    // public int[] maxSlidingWindow(int[] nums, int k) {
    //     int n = nums.length;
    //     int[] ans = new int[n - k + 1]; // Result array size should be n-k+1
        
    //     for (int i = 0; i <= n - k; i++) {
    //         int maxVal = Integer.MIN_VALUE;
            
    //         // Find max in current window [i, i+k-1]
    //         for (int j = i; j < i + k; j++) {
    //             maxVal = Math.max(maxVal, nums[j]);
    //         }
            
    //         ans[i] = maxVal; // Store the maximum in result array
    //     }
        
    //     return ans;
    // }

    public int[] maxSlidingWindowOptimized(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); // stores indices
        
        for (int i = 0; i < n; i++) {
            // Remove indices that are out of current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            
            // Remove indices whose corresponding values are smaller than current
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            
            deque.offerLast(i);
            
            // Start recording results when we have a complete window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        
        return result;
    }
}
