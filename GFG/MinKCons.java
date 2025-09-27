public class MinKCons {
    public int kBitFlips(int[] arr, int k) {
        // code here
        int n = arr.length;
        int flips = 0;
        int flipCounts = 0;

        boolean[] flipped = new boolean[n];

        for(int i=0; i<n; i++){
            if(i >= k && flipped[i-k]){
                flipCounts--;
            }

            int effectiveVal = (arr[i] + flipCounts) % 2;

            if(effectiveVal == 0){
                if(i + k > n){
                    return -1;
                }
                flips++;
                flipCounts++;
                flipped[i] = true;
            }
        }
        return flips;
    }
}
