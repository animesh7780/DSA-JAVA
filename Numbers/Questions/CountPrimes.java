public class CountPrimes {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        
        // Initialize boolean array - true means potentially prime
        boolean[] isPrime = new boolean[n];
        // Initialize all numbers as potentially prime (except 0 and 1)
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
        // Sieve of Eratosthenes
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark all multiples of i as not prime
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // Count remaining prime numbers
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
}
