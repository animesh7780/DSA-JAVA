import java.util.Stack;

public class MaxScore{
    public int maximumGain(String s, int x, int y) {
        // Determine priority
        if (x >= y) {
            return removeWithStack(s, 'a', 'b', x, y);
        } else {
            return removeWithStack(s, 'b', 'a', y, x);
        }
    }
    
    private int removeWithStack(String s, char first, char second, 
                               int firstScore, int secondScore) {
        // First pass: remove higher-scoring pairs
        Stack<Character> stack = new Stack<>();
        int totalScore = 0;
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first && c == second) {
                stack.pop();
                totalScore += firstScore;
            } else {
                stack.push(c);
            }
        }
        
        // Second pass: remove lower-scoring pairs from remaining characters
        Stack<Character> secondStack = new Stack<>();
        
        for (char c : stack) {
            if (!secondStack.isEmpty() && secondStack.peek() == second && c == first) {
                secondStack.pop();
                totalScore += secondScore;
            } else {
                secondStack.push(c);
            }
        }
        
        return totalScore;
    }
}