import java.util.Deque;
import java.util.LinkedList;

public class LongestSubarray {
    public static int longestSubarrayLength(int[] arr) {
        int maxLength = 0;
        int left = 0;
        Deque<Integer> dq = new LinkedList<>();

        for (int right = 0; right < arr.length; right++) {
            // Step 1: Maintain a monotonic decreasing deque (stores indices)
            // Remove elements smaller than the current element from the back
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[right]) {
                dq.removeLast();
            }
            // Add the current element's index to the back
            dq.addLast(right);

            // Step 2: Check and shrink the window from the left
            // The maximum element in the current window is at the front of the deque
            int maxValInWindow = arr[dq.peekFirst()];
            int currentLength = right - left + 1;

            // If the maximum value in the window is greater than the window's length,
            // the condition is violated. We must shrink the window.
            // We do this by incrementing the `left` pointer.
            while (maxValInWindow > currentLength) {
                // If the element at `left` is the current maximum, remove it from the deque
                if (dq.peekFirst() == left) {
                    dq.removeFirst();
                }
                left++;
                currentLength = right - left + 1;
                // Re-evaluate the max value if the deque is not empty
                if (!dq.isEmpty()) {
                    maxValInWindow = arr[dq.peekFirst()];
                }
            }

            // Step 3: Update maxLength if the current window is valid
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}
