import java.util.Arrays;

public class Leet16 {
    public static void main(String[] args) {
        int[] arr = { -1, 2, 1, -4 };
        System.out.println(threeSumClosest(arr, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array to use two-pointer technique
        int closest = nums[0] + nums[1] + nums[2]; // Initialize with the first three numbers

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // Update closest sum if the new sum is closer to the target
                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }

                if (sum < target) {
                    left++; // Move left pointer to increase sum
                } else if (sum > target) {
                    right--; // Move right pointer to decrease sum
                } else {
                    return sum; // Exact match found
                }
            }
        }
        return closest;
    }
}
