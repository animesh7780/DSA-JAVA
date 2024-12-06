public class Pattern8 {
    public static void main(String[] args) {
        pattern8(5);
    }

    static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int spaces = i; spaces <= n - 1; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
