public class ValidParenthesis {
    public boolean checkValidString(String s) {
        return checkValid(s, 0, 0);
    }

    boolean checkValid(String s, int cnt, int ind){
        int n = s.length();
        if(cnt < 0) return false;
        if(ind == n){
            return (cnt == 0);
        }
        
        char c = s.charAt(ind); // Process character at current index
        
        if(c == '('){
            return checkValid(s, cnt+1, ind+1);
        }
        else if(c == ')'){
            return checkValid(s, cnt-1, ind+1);
        }
        else{ // Wildcard case (assuming '*')
            return checkValid(s, cnt+1, ind+1) || // treat as '('
                checkValid(s, cnt-1, ind+1) || // treat as ')'
                checkValid(s, cnt, ind+1);     // treat as empty
        }
    }
}
