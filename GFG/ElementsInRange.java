import java.util.ArrayList;
import java.util.Arrays;

public class ElementsInRange{
    public ArrayList<Integer> cntInRange(int[] arr, int[][] queries) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int[] query : queries){
            int a = query[0];
            int b = query[1];

            int lb = lowerBound(arr, a);
            int rb = upperBound(arr, b);

            ans.add(rb - lb);
        }
        return ans;
    }

    public int lowerBound(int[] arr, int x){
        int low = 0, high = arr.length;
        while(low < high){
            int mid = low + (high - low)/2;
            if(arr[mid] >= x) high = mid;
            else low = mid+1;
        }
        return low;
    }

    public int upperBound(int[] arr, int x){
        int low = 0, high = arr.length;
        while(low < high){
            int mid = low + (high - low)/2;
            if(arr[mid] > x) high = mid;    
            else low = mid + 1;
        }
        return low;
    }
}