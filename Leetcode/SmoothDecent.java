public class SmoothDecent {
    public long getDescentPeriods(int[] prices) {
        int n = prices.length;
        long ans = 1;
        long curr = 1;

        for(int i=1; i<n; i++){
            if(prices[i-1] - prices[i] == 1){
                curr++;
            }else{
                curr = 1;
            }
            ans += curr;
        }
        return ans;
    }
}
