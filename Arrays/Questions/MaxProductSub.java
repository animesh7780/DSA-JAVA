public class MaxProductSub{
    public int maxProductAlternative(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;  // Works for all negative arrays too
       
        for(int i=0; i<n; i++){
            int pro = 1;
            for(int j=i; j<n; j++){
                pro = pro * nums[j];
                ans = Math.max(ans, pro);
            }
        }
        return ans;
    }
}