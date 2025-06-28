import java.util.Stack;

public class SortStack{
    void sortInserted(Stack<Integer> st, int x){
        if(st.isEmpty() || st.peek() < x){
            st.push(x);
            return;
        }
        int temp = st.pop();
        sortInserted(st, x);
        st.push(temp); 
    }

    void sort(Stack<Integer> st){
        if(!st.isEmpty()){
            int x = st.pop();
            sort(st);
            sortInserted(st, x);
        }
    }
}