public class ZeroFilledSubarray {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long streak = 0;
        long ans = 0;
        
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                streak++;
            }
            else{
                streak = 0;
            }
            ans += streak;
        }
        return ans;
    }
}
