public class Pattern26 {
    public static void main(String[] args) {
        pattern26(5);
    }

    static void pattern26(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(num);
            }
            System.out.println();
            num++;
        }
    }
}
