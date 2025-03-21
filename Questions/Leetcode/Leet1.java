public class Leet1 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4 };
        int target = 6;
        Leet1 obj = new Leet1();
        int[] ans = obj.twoSum(arr, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}