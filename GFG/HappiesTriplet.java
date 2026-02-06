import java.util.Arrays;

public class HappiesTriplet {
    int[] smallestDiff(int a[], int b[], int c[]) {
        // write code here
        int n = a.length;
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        int i=0, j=0, k=0;
        
        int minDiff = Integer.MAX_VALUE;
        int minSum = Integer.MAX_VALUE;
        
        int x=0, y=0, z=0;

        while(i<n && j<n && k<n){
            int minVal = Math.min(a[i], Math.min(b[j], c[k]));
            int maxVal = Math.max(a[i], Math.max(b[j], c[k]));

            int diff = maxVal - minVal;
            int sum = a[i] + b[j] + c[k];

            if(diff < minDiff || (diff == minDiff && sum < minSum)){
                minDiff = diff;
                minSum = sum;
                x = a[i];
                y = b[j];
                z = c[z]; 
            }

            if(minVal == a[i]) i++;
            else if(minVal == b[j]) j++;
            else k++;
        }

        int[] result = {x, y, z};
        Arrays.sort(result);

        return new int[]{result[2], result[1], result[0]};
    }
}
