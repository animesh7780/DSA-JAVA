import java.util.ArrayList;
import java.util.Arrays;

public class RepeatandMissing {
    ArrayList<Integer> findBoth(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);

        ArrayList<Integer> ans = new ArrayList<>();
        int repeatNum = -1;
        int missNum = -1;

        for(int i=1; i<n-1; i++){
            if(arr[i] == arr[i+1]){ 
                missNum = arr[i];
                break;
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i] != i+1){
                missNum = i+1;
                break;
            }
        }

        ans.add(repeatNum);    
        ans.add(missNum);

        return ans;
    }
}
