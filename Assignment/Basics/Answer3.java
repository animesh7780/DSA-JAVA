package Assignment.Basics;

import java.util.Scanner;

public class Answer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose multiplication table is needed");
        int n = sc.nextInt();
        System.out.println("Table of " + n + "is");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
        sc.close();
    }
}
