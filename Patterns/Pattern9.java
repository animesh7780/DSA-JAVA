public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces < i; spaces++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            for (int stars = 1; stars <= (2 * (n - i) + 1); stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
