public class MaxBitwiseOR {
    private int maxOr = 0;
    private int cnt = 0;

    public int countMaxOrSubsets(int[] nums) {
        for(int n : nums){
            maxOr |= n;
        }
        dfs(nums, 0, 0);
        return cnt;    
    }

    public void dfs(int[] nums, int idx, int currOr){
        if(idx == nums.length){
            if(currOr == maxOr && currOr != 0){
                cnt++;
            }
            return;
        }
        dfs(nums, idx + 1, currOr | nums[idx]);
        dfs(nums, idx + 1, currOr);
    }
}
