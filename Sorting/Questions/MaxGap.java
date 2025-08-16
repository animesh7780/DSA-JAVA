import java.util.Arrays;

public class MaxGap{
    public int maxGap(int[] arr) {
        if (arr == null) return 0;

        Arrays.sort(arr);
        int maxSubVal = 0;

        for (int i = 1; i < arr.length; i++) {
            int gap = arr[i] - arr[i - 1];
            maxSubVal = Math.max(maxSubVal, gap);
        }

        return maxSubVal;
    }

}