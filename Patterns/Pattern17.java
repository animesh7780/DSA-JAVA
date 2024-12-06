public class Pattern17 {
    public static void main(String[] args) {
        pattern17(5);
    }

    static void pattern17(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int totalColsInRows = i >= n ? 2 * n - i : i;

            for (int spaces = 0; spaces <= n - totalColsInRows; spaces++) {
                System.out.print(" ");
            }

            for (int j = totalColsInRows; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= totalColsInRows; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}