import java.util.Stack;

public class SubArrayRanges {

    public long subArrayRanges(int[] arr) {
        return sumSubarrayMax(arr) - sumSubarrayMin(arr);
    }

    public long sumSubarrayMin(int[] arr) {
        int n = arr.length;
        int[] prevSmaller = new int[n];
        int[] nextSmaller = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Previous Less
        for (int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            prevSmaller[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Next Less or Equal
        for (int i = n - 1; i >= 0; --i) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nextSmaller[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        long result = 0;
        for (int i = 0; i < n; ++i) {
            result += (long) arr[i] * prevSmaller[i] * nextSmaller[i];
        }

        return result;
    }

    public long sumSubarrayMax(int[] arr) {
        int n = arr.length;
        int[] prevGreater = new int[n];
        int[] nextGreater = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Previous Greater
        for (int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            prevGreater[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Next Greater or Equal
        for (int i = n - 1; i >= 0; --i) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            nextGreater[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        long result = 0;
        for (int i = 0; i < n; ++i) {
            result += (long) arr[i] * prevGreater[i] * nextGreater[i];
        }

        return result;
    }
}
