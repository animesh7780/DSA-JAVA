public class MaxSumSubArray {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        if(n < k) return -1;

        int ws = 0;
        for(int i=0; i<k; i++){
            ws += arr[i];
        }
        int maxSum = ws;

        for(int i=k; i<n; i++){
            ws += arr[i] - arr[i-k];
            if(ws > maxSum){
                maxSum = ws;
            }
        }
        return maxSum;
    }
}
