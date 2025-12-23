import java.util.Arrays;

public class NonOverlapping {
    public int maxTwoEvents(int[][] events) {
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[0] - b[0]);
        
        //suffix to find maxvalue from start to end
        int[] suffixMax = new int[n];
        suffixMax[n-1] = events[n-1][2];
        for(int i=n-2; i>=0; i--){
            suffixMax[i] = Math.max(events[i][2], suffixMax[i+1]);
        }

        int maxSum = 0;
        for(int i=0; i<n; i++){
            int nextIdx = search(events, i+1, events[i][1]);
            if (nextIdx < n) {
                maxSum = Math.max(maxSum, events[i][2] + suffixMax[nextIdx]);
            } else {
                maxSum = Math.max(maxSum, events[i][2]);
            }
        }
        return maxSum;
    }

    public int search(int[][] events, int start, int endtime){
        int left = start;
        int right = events.length;

        while(left < right){
            int mid = left + (right - left)/2;
            if(events[mid][0] > endtime) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
