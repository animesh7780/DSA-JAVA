public class Leet29 {
    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = 0;
        Leet29 obj = new Leet29();
        System.out.println(obj.divide(dividend, divisor));
    }

    public int divide(int dividend, int divisor) {
        if (dividend == -2147483648) {
            return 2147483647;
        }
        return dividend / divisor;
    }
}
