public class MinimumCoins {
    static int findChange(int[] coins, int v){
        int n = coins.length;
        int denominations = 0;

        for(int i=n-1; i>=0; i--){
            if(v >= coins[i]){
                v-=coins[i];
                denominations++;
            }
        }
        return denominations;
    }

    public static void main(String[] args) {
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int v = 70;
        int ans = findChange(coins, v);
        System.out.println(ans);
    }
}
