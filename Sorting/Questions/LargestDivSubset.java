import java.util.ArrayList;
import java.util.List;

public class LargestDivSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<n-1; i++){
            for(int j=1; j<n; j++){
                if(nums[i] % nums[j] == 0){
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                }
            }
        }
        return ans;
    }
}
