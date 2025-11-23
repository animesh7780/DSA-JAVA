import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumDivby3 {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        List<Integer> rem1 = new ArrayList<>(), rem2 = new ArrayList<>();
        for(int x : nums){
            sum += x;
            if(x % 3 == 1) rem1.add(x);
            else if(x % 3 == 2) rem2.add(x);
        }
        if(sum % 3 == 0) return sum;

        Collections.sort(rem1);
        Collections.sort(rem2);

        int remainder = sum % 3;
        int remove  = Integer.MAX_VALUE;

        if(remainder==1){
            if(!rem1.isEmpty()) remove = Math.min(remove, rem1.get(0));
            if(rem2.size() >=2) remove = Math.min(remove, rem2.get(0)+rem2.get(1));
        }
        else{
            if(!rem2.isEmpty()) remove = Math.min(remove, rem2.get(0));
            if(rem1.size() >= 2) remove = Math.min(remove, rem1.get(0)+rem2.get(1));
        }
        return remove == Integer.MAX_VALUE ? 0 : sum - remove;
    }
}
