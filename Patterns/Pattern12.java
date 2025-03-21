public class Pattern12 {
    public static void main(String[] args) {
        pattern12(5);
    }

    static void pattern12(int n) {
        for (int i = 0; i < n; i++) {
            for (int spaces = 0; spaces < i; spaces++) {
                System.out.print(" ");
            }
            for (int stars = n; stars > i; stars--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int spaces = n - i; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
