public class Leet35 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int target = 5;
        Leet35 obj = new Leet35();
        int ans = obj.searchInsert(arr, target);
        System.out.println(ans);
    }

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
