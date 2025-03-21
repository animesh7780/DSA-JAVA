public class Pattern31 {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern31(int n) {
        int originalN = n;
        for (int i = 0; i <= 2 * n; i++) {
            for (int j = 0; j <= 2 * n; j++) {
                int atEveryIndex = originalN - Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
