package Assignment.Basics;

import java.util.Scanner;

public class Answer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Currency in Ruppes:");
        double rs = sc.nextInt();
        double dollars = rs / 84.5;
        System.out.println("Currency in Dollars" + dollars);
        sc.close();
    }
}
