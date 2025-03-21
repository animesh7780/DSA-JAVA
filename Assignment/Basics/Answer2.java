package Assignment.Basics;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number");
        int n2 = sc.nextInt();

        int sum = 0;
        sum = n1 + n2;
        System.out.println("The sum of two numbers " + n1 + "and " + n2 + "is" + sum);
        sc.close();
    }
}
