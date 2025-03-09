public class Leet875 {
    public static void main(String[] args) {

    }

    public int minEatingSpeed(int[] nums, int h) {
        int left = 1, right = getMax(nums); // Set left to 1, right to max element in nums

        while (left < right) {
            int mid = left + (right - left) / 2;
            int sum = 0;

            // Calculate the sum of division results rounded up
            for (int num : nums) {
                sum += (num + mid - 1) / mid; // Alternative to Math.ceil((double)num / mid)
            }

            if (sum > h) {
                left = mid + 1; // Increase divisor
            } else {
                right = mid; // Try smaller divisor
            }
        }
        return left; // or right, both converge at the smallest valid divisor
    }

    private int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
}
