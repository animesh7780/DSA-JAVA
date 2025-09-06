import java.util.Stack;

public class ScoreOfParenthesis {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        int count = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && !st.isEmpty() && st.peek() == '('){
                count++;
                st.pop();
            }
        }
        return count;
    }
}
