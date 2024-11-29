public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 213, 2131, 1231, 67, 634, 123, 1 };
        System.out.println(findMin(arr));
    }

    static int findMin(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            min = Math.min(num, min);
        }
        return min;
    }
}
