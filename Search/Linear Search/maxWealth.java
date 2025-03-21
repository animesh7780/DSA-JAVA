public class maxWealth {
    public static void main(String[] args) {

    }

    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int rowsum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowsum += accounts[person][account];
            }
            if (rowsum > max) {
                max = rowsum;
            }
        }
        return max;
    }
}
