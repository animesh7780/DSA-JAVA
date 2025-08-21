import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Pair{
    int val;
    int ind;
     public Pair(int val, int ind){
        this.val = val;
        this.ind = ind;
     }
}

public class Range {
    public int[] smallestRange(List<List<Integer>> nums) {
        List<Pair> merged = new ArrayList<>();
        int k = nums.size();

        //flatten and annonate
        for(int i=0; i<k; i++){
            for(int num:nums.get(i)){
                merged.add(new Pair (num, i));
            }
        }
        
        //sort by val
        merged.sort(Comparator.comparingInt(a -> a.val));

        int[] freq = new int[k];
        int unique = 0, left = 0;
        int minRange = Integer.MAX_VALUE;
        int start = -1, end = -1;

        // Sliding window
        for (int right = 0; right < merged.size(); right++) {
            Pair p = merged.get(right);
            freq[p.ind]++;
            if (freq[p.ind] == 1) unique++;

            while (unique == k) {
                int curRange = merged.get(right).val - merged.get(left).val;
                if (curRange < minRange) {
                    minRange = curRange;
                    start = merged.get(left).val;
                    end = merged.get(right).val;
                }
                // Move left pointer
                Pair leftPair = merged.get(left);
                freq[leftPair.ind]--;
                if (freq[leftPair.ind] == 0) unique--;
                left++;
            }
        }
        return new int[]{start, end};
    }
}
