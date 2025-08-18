import java.util.ArrayList;
import java.util.List;

public class KClosestEle {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(right - left + 1 > k){
            if(Math.abs(arr[left] - x) > Math.abs(arr[right] - x)){
                left++;
            }
            else{
                right--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int i=left; i<=right; i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}
