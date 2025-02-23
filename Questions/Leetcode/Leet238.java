public class Leet238 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        Leet238 obj = new Leet238();
        int[] res = obj.productExceptSelf(nums);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        // Calculate prefix products
        int pro = 1;
        for (int i = 0; i < n; i++) {
            res[i] = pro;
            pro *= nums[i];
        }

        // Calculate suffix products and multiply with prefix
        pro = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= pro;
            pro *= nums[i];
        }

        return res;
    }
}
