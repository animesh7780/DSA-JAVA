public class GoodNumbers {

    private static final int MOD = 1_000_000_007;

    // Modular exponentiation (base^exp % mod)
    private long modPow(long base, long exp, int mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    public int countGoodNumbers(long n) {
        long evens = (n+1)/2;
        long odds = n/2;

        long evenPow = modPow(5, evens, MOD);
        long oddPow = modPow(4, odds, MOD);

        return (int)((evenPow+oddPow) % MOD);
    }
}
