import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    
    // Main method to generate all valid parentheses
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateAll(result, "", 0, 0, n);
        return result;
    }
    
    // Recursive helper method
    private void generateAll(List<String> result, String current, 
                           int open, int close, int max) {
        // Base case: if we've used all n pairs
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        
        // Add opening parenthesis if we haven't used all n
        if (open < max) {
            generateAll(result, current + "(", open + 1, close, max);
        }
        
        // Add closing parenthesis if it won't make string invalid
        if (close < open) {
            generateAll(result, current + ")", open, close + 1, max);
        }
    }
}
