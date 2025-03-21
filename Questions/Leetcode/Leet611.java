public class Leet611 {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 3, 4 };
        System.out.println(triangleNumber(nums));
    }

    public static int triangleNumber(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] > nums[k] && nums[i] + nums[k] > nums[j] && nums[j] + nums[k] > nums[i]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
