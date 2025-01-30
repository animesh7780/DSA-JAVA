public class Leet35 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int target = 5;
        Leet35 obj = new Leet35();
        int ans = obj.searchInsert(arr, target);
        System.out.println(ans);
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return -1;
    }
}
