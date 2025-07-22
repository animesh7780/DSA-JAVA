import java.util.HashSet;

public class Erasure {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int maxSum = 0;
        int sum = 0;
        int n = nums.length;

        for(int right=0; right<n; right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            sum += nums[right];
            
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
