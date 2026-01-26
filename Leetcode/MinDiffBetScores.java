import java.util.Arrays;

public class MinDiffBetScores {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int difMin = Integer.MAX_VALUE;

        for(int i=k-1; i<n; i++){
            int diff = nums[i] - nums[i - k + 1];
            difMin = Math.min(difMin, diff);
        }
        return difMin;
    }
}
