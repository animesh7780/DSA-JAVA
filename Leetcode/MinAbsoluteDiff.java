import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsoluteDiff {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1; i<n; i++){
            int diff = arr[i] - arr[i - 1];
            minDiff = Math.min(minDiff, diff);
        }

        for(int i=1; i<n; i++){
            if(arr[i] - arr[i-1] == minDiff){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                ans.add(pair);
            }
        }
        return ans;
    }
}
