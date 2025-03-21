public class Pattern35 {
    public static void main(String[] args) {
        pattern35(5);
    }

    static void pattern35(int n) {
        for (int i = 1; i <= n; i++) {
            for (char ch = (char) ('F' - i); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
