public class Patter6 {
    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int spaces = n - 1; spaces >= i; spaces--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
