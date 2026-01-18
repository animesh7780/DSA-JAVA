import java.util.Stack;

public class RedundantBrackets {
    public static boolean checkRedundancy(String s) {
        // code here
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch != ')'){
                st.push('(');
            }
            else{
                boolean hasOperator = false;

                while (!st.isEmpty() && st.peek() != '(') {
                    char top = st.pop();
                    if(top == '+' || top == '-' || top == '*' || top == '/'){
                        hasOperator = true;
                    }
                }
                st.pop();

                if(!hasOperator) return true;
            }
        }
        return false;
    }
}
