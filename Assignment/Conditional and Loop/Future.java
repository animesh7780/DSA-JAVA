import java.util.Scanner;

public class Future {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of your protfolio: ");
        int value = sc.nextInt();
        System.out.println("Enter the rate of return: ");
        float rate = sc.nextFloat();
        System.out.println("Enter the time period: ");
        int time = sc.nextInt();
        System.out.println("Future value is: " + (value * (1 + rate / 100) * time));
        sc.close();
    }
}
