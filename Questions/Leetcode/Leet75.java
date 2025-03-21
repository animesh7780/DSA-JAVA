import java.util.Arrays;

public class Leet75 {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        Leet75 obj = new Leet75();
        obj.sortColorsI(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void sortColors(int[] nums) {
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public void sortColorsI(int[] nums) {
        int i = 0, j = 0, k = nums.length - 1;
        while (j <= k) {
            if (nums[j] == 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            } else if (nums[j] == 1) {
                j++;
            } else {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;
            }
        }
    }
}
