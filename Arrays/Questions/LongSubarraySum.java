public class LongSubarraySum {
    //O(n^2) 
    int sumOfSubarray(int[] arr, int k, int N){
        int maxLen = 0;
        for(int i=0; i<N; i++){
            int sum = 0;
            for(int j=i; j<N; j++){
                sum += arr[j];
                if(sum == k){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }
}
