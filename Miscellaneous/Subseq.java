import java.util.ArrayList;

public class Subseq {
    public static ArrayList<Integer> findSubseq(int[] arr, int k){
        int n = arr.length;
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(arr[i] <= k){
                sum += arr[i];
                ans.add(arr[i]);
            }
            if(sum > k){
                break;
            }
        }
        return ans;
    }
}
