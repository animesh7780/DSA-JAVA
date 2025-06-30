import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<num.length(); i++){
        // Remove larger digits from stack when we find a smaller one
            while(!st.isEmpty() && k > 0 && num.charAt(i) < st.peek()) {
                st.pop();
                k--;  // Decrement remaining removals
            }
            st.push(num.charAt(i));
        }

        //if we still have removals left we just pop elements until it turns to be 0
        while(k > 0 && !st.isEmpty()){
            st.pop();
            k--;
        }

        StringBuilder str = new StringBuilder();
        while (!st.isEmpty()) {
            str.append(st.pop());
        }
        //ans stack will reverse the order 
        str.reverse();

        // Remove leading zeros
        String finalRes = str.toString().replaceFirst("^0+", "");

        // Return "0" if result is empty
        return finalRes.isEmpty() ? "0" : finalRes;
    }
}
