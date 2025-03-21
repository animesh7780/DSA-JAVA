import java.util.Scanner;

public class MultiDimensional {
    /**
     * The main method initializes a two-dimensional array with predefined values
     * and demonstrates a simple structure of a multi-dimensional array in Java.
     * Each inner array represents a row in the matrix.
     * Uncomment the first line to explore different ways of initializing a 2D
     * array.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[3][];

        int[][] arr = new int[3][3];
        // input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        sc.close();
    }
}
