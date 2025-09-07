import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SecondLargest{
    public int getSecondLargest(int[] arr) {
        // code here
        Set<Integer> set = new HashSet<>();
        int n = arr.length;

        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }

        int m = set.size();
        int[] ans = new int[m];

        int i = 0;
        for (int s : set) {
            ans[i++] = s; // fix pre-increment
        }
        if(ans.length < 2){
            return -1;
        }
        Arrays.sort(ans);
        return ans[ans.length - 2];
    }
}