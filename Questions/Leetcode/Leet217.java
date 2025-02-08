public class Leet217 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        Leet217 obj = new Leet217();
        System.out.println(obj.containsDuplicate(arr));
    }

    public boolean containsDuplicate(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                if (count > 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
