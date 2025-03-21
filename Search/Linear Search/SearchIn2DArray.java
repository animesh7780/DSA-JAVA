import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        int target = 3;
        System.out.println(searchMatrix(arr, target));
        int[] ans = searchMatrix1(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(searchMatrixmax(arr)));
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    static int[] searchMatrix1(int[][] matrix, int target) {
        if (matrix.length == 0)
            return new int[] { -1, -1 };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target)
                    return new int[] { i, j };
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] searchMatrixmax(int[][] matrix) {
        int max = matrix[0][0];
        if (matrix.length == 0)
            return new int[] { -1, -1 };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }
        return new int[] { max };
    }
}
