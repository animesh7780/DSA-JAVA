public class LongNiceSub {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int left = 0;
        int mask = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++) {
            // If overlap in bits, shrink from left
            while ((mask & nums[right]) != 0) {
                mask ^= nums[left];
                left++;
            }
            // Add current number
            mask |= nums[right];
            // Update max
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

}
