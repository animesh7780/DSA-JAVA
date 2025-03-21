import java.util.*;

public class Leet18{
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array to use two-pointer technique

        // Iterate over the array with the first index
        for (int i = 0; i < nums.length - 3; i++) {
            // Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Iterate over the array with the second index
            for (int j = i + 1; j < nums.length - 2; j++) {
                // Skip duplicates for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // Two-pointer approach to find the remaining two numbers
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    // Check if the current sum is the target
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates for the third number
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        // Skip duplicates for the fourth number
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        // Move the pointers inward after adding a valid quadruplet
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;  // We need a larger sum, so move the left pointer to the right
                    } else {
                        right--;  // We need a smaller sum, so move the right pointer to the left
                    }
                }
            }
        }

        return result;
    }
}
