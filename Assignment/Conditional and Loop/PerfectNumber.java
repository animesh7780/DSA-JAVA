import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int sum = 0;
        int ori = number;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == ori) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not perfect");
        }
        sc.close();
    }
}
