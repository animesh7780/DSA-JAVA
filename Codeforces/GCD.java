import java.util.*;

public class GCD {

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long g = arr[0];
            for (int i = 1; i < n; i++) {
                g = gcd(g, arr[i]);
            }

            if (g == 1) {
                System.out.println(2);
                continue;
            }

            long x = 2;
            while (x <= 1000000000000000000L) {
                if (gcd(g, x) == 1) {
                    System.out.println(x);
                    break;
                }
                x++;
            }
        }
    }
}
