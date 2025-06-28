public class NestingDepth {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } else if (c == ')') {
                depth--;
            }
            // Ignore other characters
        }
        
        return maxDepth;
    }
}
