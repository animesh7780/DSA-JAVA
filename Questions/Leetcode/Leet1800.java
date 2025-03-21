public class Leet1800 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 5, 10, 50 };
        System.out.println(maxAscendingSum(arr));
    }

    static int maxAscendingSum(int[] nums) {
        int maxSum = 0, sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
            } else {
                maxSum = Math.max(maxSum, sum);
                sum = nums[i];
            }
        }
        return Math.max(maxSum, sum);
    }
}
