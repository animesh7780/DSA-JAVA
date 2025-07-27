import java.util.ArrayList;
import java.util.List;

public class Divisors {
    public List<Integer> findDivisors(int n){
        List<Integer> ans = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                ans.add(i);
            }
        }
        return ans;
    }

    
}
