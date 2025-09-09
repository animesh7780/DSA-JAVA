public class MaxIndex {
    int maxIndexDiff(int[] arr) {
        int n = arr.length;
        int maxDiff = 0; // allow i==j
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                if (arr[i] <= arr[j]) {
                    maxDiff = Math.max(maxDiff, j - i);
                    break; // farthest j for this i
                }
            }
        }
        return maxDiff;
    }

}
