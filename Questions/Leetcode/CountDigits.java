public class CountDigits {
    public static void main(String[] args) {
        int n = 2446;
        System.out.println(evenlyDivides(n));
    }

    static int evenlyDivides(int n) {
        int count = 0;
        int num = n;

        while (num > 0) {
            int d = num % 10;

            if (d != 0 && n % d == 0) {
                count++;
            }

            num /= 10;
        }

        return count;
    }
}
