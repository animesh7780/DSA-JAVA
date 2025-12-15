public class ArithmaticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        long curr = 0;
        long ans = 0;
        int n = nums.length;

        if(n < 3){
            return 0;
        }

        for(int i=2; i<n; i++){
            int d1 = nums[i-1] - nums[i-2];
            int d2 = nums[i] - nums[i-1];
            if(d1 == d2){
                curr++;
            }
            else{
                curr = 0;
            }
            ans += curr;
        }
        return (int)ans;
    }
}
