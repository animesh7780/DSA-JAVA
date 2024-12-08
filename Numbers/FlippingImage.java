import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] A = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };
        System.out.println(Arrays.deepToString(flipAndInvertImage(A)));
    }

    static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][A[i].length - 1 - j];
                A[i][A[i].length - 1 - j] = temp;
            }
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = A[i][j] == 0 ? 1 : 0;
            }
        }
        return A;
    }
}
