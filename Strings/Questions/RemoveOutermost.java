public class RemoveOutermost{
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // Only add '(' if it's not the outermost opening parenthesis
                if (depth > 0) {
                    result.append(c);
                }
                depth++; // we will increase it after appending to the answer
            } else if (c == ')') {
                depth--; // while decrease it before hand
                // Only add ')' if it's not the outermost closing parenthesis
                if (depth > 0) {
                    result.append(c);
                }
            }
        }
        
        return result.toString();
    }
}