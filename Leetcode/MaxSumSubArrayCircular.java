public class MaxSumSubArrayCircular {
    public int maxCircularSum(int arr[]) {
        // code here
        int totalSum = 0;
        
        int maxEnding = arr[0], maxSum = arr[0];
        int minEnding = arr[0], minSum = arr[0];

        for(int i=0; i<arr.length; i++){
            int x = arr[i];
            totalSum += x;
            
            if(i > 0){
                maxEnding = Math.max(x, maxEnding + x);
                maxSum = Math.max(maxSum, maxEnding);

                minEnding = Math.min(x, minEnding + x);
                minSum = Math.min(minSum, minEnding);
            }
        }
        if(maxSum < 0) return maxSum;

        return Math.max(maxSum, totalSum - minSum);
    }
}
