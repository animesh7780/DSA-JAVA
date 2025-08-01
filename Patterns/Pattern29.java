public class Pattern29 {
    public static void main(String[] args) {
        pattern29(5);
    }

    static void pattern29(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int totalColsInRows = i > n ? 2 * n - i : i;
            for (int j = 1; j <= totalColsInRows; j++) {
                System.out.print("*");
            }
            for (int spaces = 1; spaces <= 2 * n - i; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= totalColsInRows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
