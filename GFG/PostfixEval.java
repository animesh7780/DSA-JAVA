import java.util.Stack;

public class PostfixEval {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();

        for(String x : arr){
            if (x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/")){
                int operand1 = st.pop();
                int operand2 = st.pop(); 

                int res = 0;
                switch (x) {
                    case "+": res = operand1 + operand2;break;                        
                    case "-": res = operand2 - operand1;break;
                    case "*": res = operand1 * operand2;break;
                    case "/": 
                        res = (int) Math.floor((double) operand2 / operand1);
                        break;
                    case "^": res = (int) Math.pow((double) operand2, operand1);break;
                    default:
                        break;
                }
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(x));
            }
        }
        return st.pop();
    }
}
