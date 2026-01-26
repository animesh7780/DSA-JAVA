import java.util.Arrays;

public class MinimizeMaxPairSum {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxSum = Integer.MIN_VALUE;
        int i=0, j = n-1;

        while(i < n-1 && j >= 0){
            int pairSum = nums[i] + nums[j];
            maxSum = Math.max(maxSum, pairSum);
            i++;
            j--;
        }
        return maxSum;
    }
}
