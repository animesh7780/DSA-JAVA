import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = {n}; 
        Stack<Integer> st = new Stack<>();
         // Process from right to left
        for(int i = n - 1; i >= 0; i--) {
            // Remove elements from stack that are <= current element
            while(!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }
            
            // If stack is empty, no greater element exists
            if(st.isEmpty()) {
                ans[i] = -1;
            } else {
                // Top of stack is the next greater element
                ans[i] = st.peek();
            }
            
            // Push current element to stack
            st.push(nums[i]);
        }
        
        return ans; // Fixed: added return statement
    }
}
