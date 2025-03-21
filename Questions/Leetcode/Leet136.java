public class Leet136 {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1 };
        Leet136 obj = new Leet136();
        System.out.println(obj.singleNumber(arr));
    }

    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
