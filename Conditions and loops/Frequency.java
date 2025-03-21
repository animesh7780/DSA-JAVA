public class Frequency {
    public static void main(String[] args) {
        int n = 63289326;

        int count = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit == 6) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
