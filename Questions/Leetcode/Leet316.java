import java.util.Stack;

public class Leet316 {
    public static void main(String[] args) {

    }

    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else if (stack.contains(ch)) {
                continue;
            }

        }
    }
}
