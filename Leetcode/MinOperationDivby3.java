public class MinOperationDivby3 {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int ops = 0;

        for(int i=0; i<n; i++){
            if(nums[i] % 3 == 0){
                continue;
            }
            else if((nums[i] - 1) % 3 == 0 || (nums[i] + 1) % 3 == 0){
                ops++;
            }
        }
        return ops;
    }
}
