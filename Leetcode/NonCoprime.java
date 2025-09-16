import java.util.ArrayList;
import java.util.List;

public class NonCoprime{
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> st = new ArrayList<>();

        for(int x : nums){
            st.add(x);

            while(st.size() > 1){
                x = st.get(st.size() - 1);
                int y = st.get(st.size() - 2);
                int g = gcd(x, y);

                if(g == 1) break;

                st.remove(st.size() - 1);
                st.set(st.size() - 1, (int) ((long) x*y / g));
            }
        }
        return st;
    }

    private int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}