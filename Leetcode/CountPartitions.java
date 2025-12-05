public class CountPartitions {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int count = 0;
        int sum = 0;

        for(int i=0; i<n; i++) sum += nums[i];
        if(sum % 2 != 0) return 0;

        int left = 0, right = sum;
        
        for(int i=0; i<n-1; i++){
            left += nums[i];
            right -= nums[i];
            if((left - right) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
