import java.util.Scanner;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int n = scanner.nextInt(); // divisor
        String[] arr = scanner.next().split("");
        int[] numbers = new int[arr.length];

        // Convert string array to integer array
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }

        // Calculate the number of pairs
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] + numbers[j]) % n == 0) {
                    count++;
                }
            }
        }

        // Print the result
        System.out.println(count);

        scanner.close();
    }
}