public class Reverse {
    public static void main(String[] args) {
        int n = 3458;
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            rev = digit + (rev * 10);
            n = n / 10;
        }
        System.out.println(rev);
    }
}
