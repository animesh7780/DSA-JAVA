import java.util.Stack;

public class Leet316 {
    public static void main(String[] args) {

    }

    public String removeDuplicateLetters(String s) {
        boolean[] visited = new boolean[256];
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!visited[c]) {
                sb.append(c);
                visited[c] = true;
            }
        }
        return sb.toString();
    }

    public String removeDuplicateLettersII(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (stack.contains(ch)) {
                continue; // Skip if character already in stack
            }
            stack.push(ch);
        }

        // Convert stack to string
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

}
