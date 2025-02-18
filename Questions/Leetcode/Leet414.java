import java.util.Arrays;

public class Leet414 {
    public static void main(String[] args) {

    }

    public int thirdMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        if(nums.length < 3) {
            return nums[nums.length - 1];
        }
        return nums[nums.length - 3];
    }
}
