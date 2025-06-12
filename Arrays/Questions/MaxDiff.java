public class MaxDiff {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        
        for(int i = 0; i < n - 1; i++) {  
            ans = Math.max(ans, Math.abs(nums[i] - nums[i+1]));
        }
        
        ans = Math.max(ans, Math.abs(nums[0] - nums[n-1]));
        
        return ans;
    }
}
