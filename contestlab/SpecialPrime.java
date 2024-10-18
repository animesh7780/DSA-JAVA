import java.util.*;
import java.math.BigInteger;

public class SpecialPrime {

    // Helper method to check if a number is prime using BigInteger
    public static boolean isPrime(BigInteger num) {
        return num.isProbablePrime(10); // Efficient prime check with certainty
    }

    // Generate all prime numbers up to a given limit
    public static List<Integer> generatePrimes(int limit) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < limit; i++) {
            if (isPrime(BigInteger.valueOf(i)))
                primes.add(i);
        }
        return primes;
    }

    // Method to generate all possible concatenated prime numbers
    public static void generateCombinations(List<Integer> primes, String current, List<BigInteger> results) {
        for (Integer prime : primes) {
            String newCombination = current + prime; // Concatenate current string with a prime
            BigInteger value = new BigInteger(newCombination); // Convert to BigInteger

            if (isPrime(value)) {
                results.add(value); // Add to results if the new number is prime
                generateCombinations(primes, newCombination, results); // Recursive call for more combinations
            }
        }
    }

    // Method to find the largest special prime less than N
    public static BigInteger findLargestSpecialPrime(int N) {
        List<Integer> primes = generatePrimes(N); // Generate primes less than N
        List<BigInteger> specialPrimes = new ArrayList<>();

        // Generate all possible prime combinations
        generateCombinations(primes, "", specialPrimes);

        // Filter and find the largest special prime less than N
        BigInteger largestSpecialPrime = BigInteger.valueOf(-1);
        BigInteger limit = BigInteger.valueOf(N);

        for (BigInteger specialPrime : specialPrimes) {
            if (specialPrime.compareTo(limit) < 0) {
                largestSpecialPrime = largestSpecialPrime.max(specialPrime);
            }
        }

        return largestSpecialPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        BigInteger result = findLargestSpecialPrime(input);
        if (result.compareTo(BigInteger.valueOf(-1)) != 0) {
            System.out.println("Largest special prime less than " + input + " is: " + result);
        } else {
            System.out.println("No special prime found less than " + input);
        }
    }
}
