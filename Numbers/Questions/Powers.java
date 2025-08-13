public class Powers {
    public int numberOfWays(int n, int x) {
        int sum = 0;
        int ways = 0;
        int limit = (int) Math.pow(n, 1.0 / x);

        for(int i=0; i<limit; i++){
            if(Math.pow(i, x) <= n){
                sum += Math.pow(i, x);
            }
            if(sum == n){
            ways += 1;
            }
        }    
        return ways;
    }
}
