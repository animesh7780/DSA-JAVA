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

    public int[] maxSlidingWindow(int[] nums, int k){
        int n = nums.length;
        int ans[] = new int [n-k-1];
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i=0; i<n; i++){
            if(!dq.isEmpty() && dq.peekFirst() < i-k+1){
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            
            dq.offer(i);

            if(i >= k-1){
                ans[i-k+1] = nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}
