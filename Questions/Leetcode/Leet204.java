public class Leet204 {
    public static int countPrime(int n) {
        int count = 0;
        if (n < 2) return 0;      // 0 and 1 are not prime
        if (n == 2 || n == 3) return 1;  // 2 and 3 are prime
        if ((n & 1) == 0) return 0;  // Check if even (except 2)

        // Check odd numbers from 3 to √n
        for (int i = 3; (i * i) <= n; i += 2) {
            if ((n % i) != 0){
                count++;
            }  // No direct bitwise division, but still optimized
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 37;
        System.out.println(num + " is prime: " + countPrime(num)); // Output: true
    }
}
