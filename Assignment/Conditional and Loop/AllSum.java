import java.util.Scanner;

public class AllSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOfNegative = 0;
        int sumOfPositive = 0;
        while (true) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else if (n < 0) {
                sumOfNegative += n;
            } else {
                sumOfPositive += n;
            }
        }
        System.out.println("Sum of negative numbers: " + sumOfNegative);
        System.out.println("Sum of positive numbers: " + sumOfPositive);
        sc.close();
    }
}
