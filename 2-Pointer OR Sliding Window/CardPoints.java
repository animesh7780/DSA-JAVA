public class CardPoints {
    int findMaxSum(int[] arr, int k){
        int lsum = 0;
        int rsum = 0;
        int maxSum = 0;
        int n = arr.length;

        for(int i=0; i<k; i++){
            lsum = lsum + arr[i];
            maxSum = lsum;
        }
        int rindex = n-1;
        for(int i = k-1; i >= 0; i--){
            lsum = lsum - arr[i];
            rsum = rsum + arr[rindex];
            rindex--;
            maxSum = Math.max(maxSum, lsum+rsum);
        }
        return maxSum;
    }
}
