public class Leet485 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        Leet485 obj = new Leet485();
        System.out.println(obj.findMaxConsecutiveOnes(arr));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                ans = Math.max(ans, count);
            } else {
                count = 0;
            }
        }
        return ans;
    }
}
