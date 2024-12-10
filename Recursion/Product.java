public class Product {
    public static void main(String[] args) {
        int n = 1212;
        System.out.println(product(n));
    }

    static int product(int n) {
        if (n % 10 == n) {
            return n;
        }
        return n % 10 * product(n / 10);
    }
}
