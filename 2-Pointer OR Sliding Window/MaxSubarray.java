public class MaxSubarray{
    public int maxSubArray(int[] nums) {
        // Stores the result (maximum sum found so far)
        int res = nums[0];
        
        // Maximum sum of subarray ending at current position
        int maxEnding = nums[0];

        for (int i = 1; i < nums.length; i++) {
            
            // Either extend the previous subarray or start 
            // new from current element
            maxEnding = Math.max(maxEnding + nums[i], nums[i]);
          
            // Update result if the new subarray sum is larger
            res = Math.max(res, maxEnding);
        }
        return res;
    }
}