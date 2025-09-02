import java.util.HashSet;
import java.util.Set;

public class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Set<String> pairs = new HashSet<>();
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(Math.abs(nums[i] - nums[j]) == k){
                    int small = Math.min(nums[i], nums[j]);
                    int large = Math.max(nums[i], nums[j]);
                    //saving the small and large
                    String pair = small + "," + large;
                    pairs.add(pair);
                }
            }
        }
        return pairs.size();
    }
}
