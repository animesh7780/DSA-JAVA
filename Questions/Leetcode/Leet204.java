import java.util.Arrays;

public class Leet204 {
    public static int countPrime(int n) {
        if (n <= 1)
            return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false; // Mark multiples as not prime
                }
            }
        }
        int count = 0;
        for (boolean prime : isPrime) {
            if (prime)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(isPrime(num));
    }
}
