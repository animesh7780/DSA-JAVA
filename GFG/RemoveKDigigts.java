import java.util.Stack;

public class RemoveKDigigts {
    public String removeKdig(String s, int k) {
        // code here
        int n = s.length();
        if(k == n) return "0";

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            while(!st.isEmpty() && st.peek() > c){
                st.pop();
                k--;
            }

            st.push(c);
        }

        while (k>0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());
        sb.reverse();

        int i=0;
        while(i < sb.length() && sb.charAt(i) == '0') i++;

        String ans = sb.substring(i);
        return ans.length() == 0 ? "0" : ans;
    }
}
