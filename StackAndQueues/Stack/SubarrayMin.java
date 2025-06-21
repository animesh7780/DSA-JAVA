public class SubarrayMin {
    public int sumSubarrayMins(int[] arr) {
        //Time Limit Exceeded
        int MOD = 1000000007;
        long totalSum = 0;
         for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    min = Math.min(arr[k], min);
                }
                totalSum = (totalSum + min) % MOD;
            }
        }
        return (int)totalSum;
    }
}
