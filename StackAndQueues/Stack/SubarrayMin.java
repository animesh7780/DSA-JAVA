import java.util.Stack;

public class SubarrayMin {
    // public int sumSubarrayMins(int[] arr) {
    //     //Time Limit Exceeded
    //     int MOD = 1000000007;
    //     long totalSum = 0;
    //      for (int i = 0; i < arr.length; i++) {
    //         int min = Integer.MAX_VALUE;
    //         for (int j = i; j < arr.length; j++) {
    //             for (int k = i; k <= j; k++) {
    //                 min = Math.min(arr[k], min);
    //             }
    //             totalSum = (totalSum + min) % MOD;
    //         }
    //     }
    //     return (int)totalSum;
    // }

    public int sumSubarrayMins(int[] arr) {
        int MOD = 1_000_000_007;
        int n = arr.length;
        int[] prevSmaller = new int[n];
        int[] nextSmaller = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Previous Less Element
        for (int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            prevSmaller[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Next Less or Equal Element
        for (int i = n - 1; i >= 0; --i) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nextSmaller[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        long result = 0;
        for (int i = 0; i < n; ++i) {
            result = (result + (long) arr[i] * prevSmaller[i] * nextSmaller[i]) % MOD;
        }

        return (int) result;
    }

}
