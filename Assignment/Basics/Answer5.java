package Assignment.Basics;

import java.util.Scanner;

public class Answer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to sum. Enter 'x' to stop:");

        int sum = 0;

        while (true) {
            String input = sc.next();

            if (input.equalsIgnoreCase("x")) {
                break;
            }
            int n = Integer.parseInt(input);
            sum += n;
        }

        System.out.println("The sum: " + sum);
        sc.close();
    }
}
