import java.util.ArrayList;
import java.util.Arrays;

public class OverlappingIntervals {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();

        res.add(arr[0]);

        for(int i=1; i<arr.length; i++){
            int[] last = res.get(res.size() - 1);
            int[] curr = arr[i];

            if(curr[0] <= last[1]){
                last[1] = Math.max(last[1], curr[1]);
            }
            else{
                res.add(curr);
            }
        }
        return res;
    }
}
