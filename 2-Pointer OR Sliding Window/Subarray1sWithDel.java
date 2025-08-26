public class Subarray1sWithDel {
    public int longestSubarray(int[] nums) {
        int left = 0, maxLen = 0, zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // maxLen tracks the length of window with at most one zero
            maxLen = Math.max(maxLen, right - left + 1);
        }

        // Problem states deletion of one element: longest length after deleting one zero
        // So, the result is maxLen - 1 since we must delete one element.
        return maxLen > 0 ? maxLen - 1 : 0;
    }
}
