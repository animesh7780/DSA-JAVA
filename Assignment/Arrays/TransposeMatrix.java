import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[][] transposedMatrix = transpose(matrix);

        for (int[] row : transposedMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
