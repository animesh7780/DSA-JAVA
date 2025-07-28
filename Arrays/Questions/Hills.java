public class Hills {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int count = 0;
        if (n < 3) return 0;

        for (int i = 1; i < n - 1; i++) {
            if (nums[i] == nums[i - 1]) continue; // skip consecutive duplicates to avoid double counting

            int left = i - 1;
            while (left >= 0 && nums[left] == nums[i]) left--;
            if (left < 0) continue;

            int right = i + 1;
            while (right < n && nums[right] == nums[i]) right++;
            if (right >= n) continue;

            if (nums[i] > nums[left] && nums[i] > nums[right]) {
                count++;
            } else if (nums[i] < nums[left] && nums[i] < nums[right]) {
                count++;
            }
        }
        return count;
    }

}
