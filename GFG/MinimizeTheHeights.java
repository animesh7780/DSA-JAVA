import java.util.Arrays;

public class MinimizeTheHeights {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);

        int minDiff = arr[n-1] - arr[0];
        
        int minH = arr[0] + k;
        int maxH = arr[n-1] - k; 

        for(int i=1; i<n; i++){
            int newMin = Math.min(minH, arr[i] - k);
            int newMax = Math.max(maxH, arr[i - 1] + k);

            if(arr[i] - k < 0) continue;

            minDiff = Math.min(minDiff, newMax - newMin);
        }

        return minDiff;
    }  
}
