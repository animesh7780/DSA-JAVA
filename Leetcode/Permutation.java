import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
       Arrays.sort(nums);
       List<List<Integer>> ans = new ArrayList<>();
       boolean[] used = new boolean[nums.length];
       backtrackU(nums, new ArrayList<>(), used, ans);
       return ans;   
    }

    public void backtrackU(int[] nums, List<Integer> curr, boolean[] used, List<List<Integer>> res){
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1] && used[i - 1] == false)
                continue;

            if(!used[i]){
                used[i] = true;
                curr.add(nums[i]);
                backtrackU(nums, curr, used, res);
                curr.remove(curr.size() - 1);
                used[i] = false;
            }
        }
    }
}


