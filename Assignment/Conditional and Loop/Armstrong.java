import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int noOfDigits = String.valueOf(n).length();// count the digits
        int armNumber = 0;

        while (n > 0) {
            int digit = n % 10;
            armNumber += Math.pow(digit, noOfDigits);
            n /= 10;
        }
        if (armNumber == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
        sc.close();
    }
}
