public class Leet152 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -2, 4 };
        Leet152 obj = new Leet152();
        System.out.println(obj.maxProduct(arr));
    }

    public int maxProduct(int[] nums) {
        int pro = 1;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                pro = nums[i] * nums[j];
            }
            ans = Math.max(ans, pro);
        }
        return ans;
    }
}
