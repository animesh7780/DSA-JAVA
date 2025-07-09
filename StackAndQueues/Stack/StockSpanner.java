import java.util.Stack;

class Pair {
    int first;
    int second;
    
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class StockSpanner {
    Stack<Pair> st;
    int ind = -1;
    
    public StockSpanner() {
        st = new Stack<>();
        ind = -1;
    }

    public int next(int price){
        ind = ind + 1;

        while(!st.isEmpty() && st.peek().first <= price){
            st.pop();
        }

        int ans = st.isEmpty() ? ind+1 :ind - st.peek().second;

        st.push(new Pair(price, ind));

        return ans;
    }
}
