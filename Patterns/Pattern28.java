public class Pattern28 {
    public static void main(String[] args) {
        pattern28(5);
    }

    static void pattern28(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int totalColsInRows = i >= n ? 2 * n - i - 1 : i + 1;

            int noOfSpaces = n - totalColsInRows;

            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < totalColsInRows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
