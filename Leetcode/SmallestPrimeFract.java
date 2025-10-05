import java.util.ArrayList;
import java.util.Collections;

public class SmallestPrimeFract {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[] ans = new int[2];
        int n = arr.length;
        int left = 0, right = left+1;
        ArrayList<Double> list = new ArrayList<>();
        
        while(left < n-1){
            right = left + 1;
            while(right < n){
                // Store the fraction as a double value
                list.add((double)arr[left] / arr[right]);
                right++;
            }
            left++;
        }

        Collections.sort(list);

        // Get the k-th smallest fraction (k-1 index since 0-based)
        double target = list.get(k-1);
        
        // Find the original numerator and denominator that produced this decimal
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                double currentFraction = (double)arr[i] / arr[j];
                // Use epsilon for floating point comparison
                if(Math.abs(currentFraction - target) < 1e-9){
                    ans[0] = arr[i];  // numerator
                    ans[1] = arr[j];  // denominator
                    return ans;
                }
            }
        }
    
        return ans;
    }
}
