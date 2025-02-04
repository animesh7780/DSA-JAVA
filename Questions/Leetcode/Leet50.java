public class Leet50 {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        Leet50 obj = new Leet50();
        System.out.println(obj.myPow(x, n));
    }

    public double myPow(double x, int n) {
        double ans = 1;
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            x = 1 / x;

            for (int i = 0; i < -n; i++) {
                ans *= x;
            }
        }
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                ans *= x;
            }
        }
        return ans;
    }
}
