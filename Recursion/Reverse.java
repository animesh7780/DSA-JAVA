public class Reverse {
    static int sum = 0;

    public static void main(String[] args) {
        int n = 12345;
        reverse(n);
        System.out.println(sum); // Print the final reversed number here
        System.out.println(reverse2(n));
    }

    static void reverse(int n) {
        if (n == 0) {
            return;
        } else {
            int rem = n % 10;
            sum = sum * 10 + rem;
            reverse(n / 10);
        }
    }

    static int reverse2(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }
}
