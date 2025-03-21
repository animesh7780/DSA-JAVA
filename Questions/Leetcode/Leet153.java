public class Leet153 {
    public static void main(String[] args) {

    }

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) { // mid>start is important
                return mid - 1;
            }
            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int findMin(int[] nums) {
        int pivot = findPivot(nums);
        return nums[pivot + 1];
    }
}
