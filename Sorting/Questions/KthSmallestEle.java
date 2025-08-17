import java.util.Arrays;

public class KthSmallestEle {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;           // number of rows
        int m = matrix.length;        // number of columns
        int[] arr = new int[n * m];      // total elements

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[index++] = matrix[i][j];
            }
        }

        Arrays.sort(arr);
        return arr[k - 1];               // zero-based indexing!
    }

}
