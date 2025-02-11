public class Leet20 {
    public static void main(String[] args) {
        String s = "([)]";
        Leet20 obj = new Leet20();
        System.out.println(obj.isValid(s));
    }

    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        if (!isMatchingPair(s.charAt(0), s.charAt(s.length() - 1))) {
            return false;
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                count++;
            } else if (ch == ')' || ch == '}' || ch == ']') {
                count--;
            }

            if (count < 0) {
                return false; // More closing brackets than opening
            }
        }
        return count == 0;
    }

    // Helper function to check matching pairs
    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}