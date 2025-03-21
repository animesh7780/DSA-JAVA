import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit integer: ");
        int number = scanner.nextInt();
        scanner.close();

        int encryptedNumber = encryptNumber(number);
        System.out.println("Encrypted number: " + encryptedNumber);
    }

    public static int encryptNumber(int number) {
        int[] digits = new int[4];

        for (int i = 3; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        for (int i = 0; i < 4; i++) {
            digits[i] = (digits[i] + 5) % 10;
        }

        int temp = digits[0];
        digits[0] = digits[2];
        digits[2] = temp;

        temp = digits[1];
        digits[1] = digits[3];
        digits[3] = temp;

        int encryptedNumber = 0;
        for (int digit : digits) {
            encryptedNumber = encryptedNumber * 10 + digit;
        }

        return encryptedNumber;
    }
}