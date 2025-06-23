import java.util.Arrays;

public class SJF {
    static double shortestJob(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int totalWaitTime = 0;
        int currentTime = 0;
        
        for(int i = 0; i < n; i++) {
            totalWaitTime += currentTime;  // Wait time for job i
            currentTime += arr[i];         // Update current time after job i completes
        }
        
        return (double) totalWaitTime / n;  // Average wait time
    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,2,5};
        double ans = shortestJob(arr);
        System.out.println(ans);
    }
}
