public class MaxMinHeight {
    public int maxMinHeight(int[] arr, int k, int w) {
        // code here
        long low = Integer.MAX_VALUE;
        long high = 0;

        for(int x : arr){
            low = Math.min(low, x);
            high = Math.max(high, x);
        }

        high = high + k;// max possible
        
        long ans = low;

        while(low <= high){
            long mid = (low + high) / 2;

            if(canAchieve(arr, k, w, mid)){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return (int)ans;
    }

    private boolean canAchieve(int[] arr, int k, int w, long target){
        int n = arr.length;
        long[] water = new long[n+1];
        long added = 0;
        long ops = 0;

        for(int i=0; i<n; i++){
            added += water[i];

            long current = arr[i] + added;

            if(current < target){
                long need = current - target;
                ops += need;

                if(ops > k)return false;

                added += need;
                if(i + w < water.length){
                    water[i+w] -= need;
                }
            }
        }
        return true;
    }
}
