import java.util.Scanner;

public class MaximumOR {
    public static int maxOR(int[] nums, int k) {
        int n = nums.length;
        int maxResult = 0;

        // Precompute powers of 2 up to 2^k to avoid recalculating.
        int[] powersOfTwo = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            powersOfTwo[i] = (int) Math.pow(2, i);
        }

        // Try applying the operation 0 to k times on each element.
        for (int i = 0; i < n; i++) {
            int original = nums[i];

            // Check the OR value for each possible modification of the current element.
            for (int j = 0; j <= k; j++) {
                int modified = original * powersOfTwo[j];

                // Calculate the OR value of the entire array with this modification.
                int currentOR = 0;
                for (int idx = 0; idx < n; idx++) {
                    if (idx == i) {
                        currentOR |= modified;
                    } else {
                        currentOR |= nums[idx];
                    }
                }

                // Update the maximum result if this OR value is higher.
                maxResult = Math.max(maxResult, currentOR);
            }
        }

        return maxResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input numbers in one line.
        System.out.println("Enter the elements separated by spaces:");
        String[] input = scanner.nextLine().split(" ");

        // Parse the numbers into an integer array.
        int[] nums = new int[input.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        // Ask for the value of k separately.
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Call the maxOR function and print the result.
        int result = maxOR(nums, k);
        System.out.println("The maximum OR value is: " + result);

        scanner.close();
    }
}
