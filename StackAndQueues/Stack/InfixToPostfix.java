import java.util.Stack;

public class InfixToPostfix {

    // A utility function to return
  // precedence of a given operator
  // Higher returned value means
  // higher precedence

    static int Prec(char ch) {
    switch (ch) {
    case '+':
    case '-':
      return 1;

    case '*':
    case '/':
      return 2;

    case '^':
      return 3;
    }
    return -1;
  }

  String infToPost(String S){

    String res = new String("");
    Stack<Character> st = new Stack<>();

    for(int i=0; i<S.length(); i++){
        char c = S.charAt(i);

      // If the scanned character is an
      // operand, add it to output.
        if(Character.isLetterOrDigit(c)){
            res += c;
        }

        // If the scanned character is an '(',
       // push it to the stack.
        else if(c == '('){
            st.push(c);
        }

        // If the scanned character is an ')',
      // pop and output from the stack
      // until an '(' is encountered.

      else if(c == ')'){
        while(!st.isEmpty() && st.peek() != '('){
            res += st.pop();
        }
        st.pop();
      }

      else{
        while (!st.isEmpty() && Prec(c) <=
          Prec(st.peek())) {

          res += st.pop();
      }
      st.push(c);
    }
    
  }
      // pop all the operators from the stack
    while (!st.isEmpty()) {
      if (st.peek() == '(')
        return "Invalid Expression";
      res += st.pop();
    }
    return res;
  }
}

