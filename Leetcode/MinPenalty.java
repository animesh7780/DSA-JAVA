public class MinPenalty {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] prefix = new int[n + 1]; // prefix[i] = # of 'N's from 0 to i-1
        int[] suffix = new int[n + 1]; // suffix[i] = # of 'Y's from i to n-1

        // Build prefix array
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i-1] + (customers.charAt(i-1) == 'N' ? 1 : 0);
        }

        // Build suffix array
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i+1] + (customers.charAt(i) == 'Y' ? 1 : 0);
        }

        // Find minimum penalty and earliest hour
        int minPenalty = Integer.MAX_VALUE;
        int bestHour = 0;
        for (int i = 0; i <= n; i++) {
            int penalty = prefix[i] + suffix[i];
            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestHour = i;
            }
        }
        return bestHour;
    }
}
