public class Lett3151 {
    public static void main(String[] args) {
        int[] nums = { 1 };
        Lett3151 obj = new Lett3151();
        System.out.println(obj.isArraySpecial(nums));
    }

    public boolean isArraySpecial(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] & 1) == (nums[i + 1] & 1)) {
                return false;
            }
        }
        return true;
    }
}
