public class Pattern30 {
    public static void main(String[] args) {
        pattern30(5);

    }

    static void pattern30(int n) {
        for (int i = 1; i <= n; i++) {

            for (int spaces = 0; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
