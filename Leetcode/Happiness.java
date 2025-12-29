import java.util.Arrays;

public class Happiness {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long totalHappiness = 0;
        int n = happiness.length;

        for(int i=n-1; i>=0; i++){
            totalHappiness += Math.max(happiness[n - 1 - i] - i, 0);
        }
        return totalHappiness;
    }
}
