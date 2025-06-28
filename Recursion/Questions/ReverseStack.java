import java.util.Stack;

public class ReverseStack {
    void reverseStack(Stack<Integer> st){
        
        if(!st.isEmpty()){
            int temp = st.pop();
            reverseStack(st);
            insertAtBottom(st, temp);
        }
    }

    void insertAtBottom(Stack<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);
        }else{
            int a = st.pop();
            insertAtBottom(st, a);
            st.push(a);
        }
    }
}
