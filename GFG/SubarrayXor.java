public class SubarrayXor {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int n = arr.length;
        if(n < k) return -1;

        int ws = 0;
        for(int i=0; i<k; i++){
            ws ^= arr[i];
        }
        
        int maxXor = ws;

        for(int i=k; i<n; i++){
            ws ^= arr[i] ^ arr[i - k];
            if(ws > maxXor){
                maxXor = ws;
            }
        }
        return maxXor;
    }
}
