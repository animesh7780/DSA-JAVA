public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern5(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int totalColsInRows = i > n ? 2 * n - i : i;
            for (int j = 1; j <= totalColsInRows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
