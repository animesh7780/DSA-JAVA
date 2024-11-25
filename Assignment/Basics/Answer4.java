package Assignment.Basics;

import java.util.Scanner;

public class Answer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number");
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number");
        int n2 = sc.nextInt();

        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

    }
}
