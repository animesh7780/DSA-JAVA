import java.util.Stack;

public class DecodeString {
    static String decodeString(String s) {
        // code here
        StringBuilder curr = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> st1 = new Stack<>();
        int k = 0;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                k = k * 10 + c - '0';
            }
            else if(c == ']'){
                int repeat = st.pop();
                StringBuilder last = st1.pop();

                for(int i=1; i<=repeat; i++){
                    last.append(curr);
                }

                curr = last;
            }
            else if(c == '['){
                st.push(k);
                st1.push(curr);
                k = 0;
                curr = new StringBuilder();
            }
            else{
                curr.append(c);
            }
        }
        return curr.toString();
    }
}
