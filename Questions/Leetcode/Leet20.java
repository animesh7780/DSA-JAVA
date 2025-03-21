import java.util.Stack;

public class Leet20 {
    public static void main(String[] args) {
        String s = "]";
        Leet20 obj = new Leet20();
        System.out.println(obj.isValid(s));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false; // Closing bracket without opening

                char top = stack.peek();
                if ((c == ')' && top == '(') ||
                        (c == '}' && top == '{') ||
                        (c == ']' && top == '[')) {
                    stack.pop(); // Valid pair
                } else {
                    return false; // Mismatched pair
                }
            }
        }
        return stack.isEmpty(); // If stack is empty, all brackets were matched
    }
}