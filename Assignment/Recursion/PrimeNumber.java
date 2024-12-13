class Solution {
    // Helper function to check divisibility
    private boolean isPrimeHelper(int n, int divisor) {
        // Base case: if divisor exceeds square root of n, n is prime
        if (divisor * divisor > n) {
            return true;
        }
        // If n is divisible by divisor, it's not prime
        if (n % divisor == 0) {
            return false;
        }
        // Recursive call: check next divisor
        return isPrimeHelper(n, divisor + 1);
    }

    // Main function to check if a number is prime
    public boolean isPrime(int n) {
        // Handle edge cases
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        if (n == 2) {
            return true; // 2 is the only even prime
        }
        // Call helper starting from 2
        return isPrimeHelper(n, 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 29;
        System.out.println(num + " is prime? " + solution.isPrime(num)); // Output: true
    }
}
