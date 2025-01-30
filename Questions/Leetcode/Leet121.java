public class Leet121 {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        Leet121 obj = new Leet121();
        System.out.println(obj.maxProfit2(arr));
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > profit) {
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }

    public int maxProfit2(int[] prices) {
        int minCost = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minCost) {
                minCost = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minCost);
            }
        }
        return maxProfit;
    }
}
