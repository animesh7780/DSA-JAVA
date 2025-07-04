public class MaxXOR {
    public int findMaximumXOR(int[] nums) {
        int n = nums.length;
        int max = 0;

        for(int i=1; i<n; i++){
            max = Math.max(max, nums[i-1]^nums[i]);
        }
        return max;
    }
}
