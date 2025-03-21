public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }

    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces <= i; spaces++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
