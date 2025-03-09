public class Leet540 {
    public static void main(String[] args) {

    }

    public int singleNonDuplicate(int[] nums) {
        int right = 0, left = nums.length - 1;
        while (right < left) {
            int mid = right + (left - right) / 2;
            if (nums[mid] == nums[mid ^ 1]) {
                right = mid + 1;
            } else {
                left = mid;
            }
        }
        return nums[right];
    }
}