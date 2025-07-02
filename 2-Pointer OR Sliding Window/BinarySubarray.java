public class BinarySubarray {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    private int atMost(int[] nums, int goal) {
        int left = 0;
        int count = 0;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            // Use a while loop to adjust the left pointer
            while (sum > goal) {
                sum -= nums[left];
                left++;
            }
            // Count the number of valid subarrays ending at 'right'
            count += right - left + 1; // This counts all subarrays from left to right
        }
        return count;
    }
}
