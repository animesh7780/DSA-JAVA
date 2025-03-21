package Methods;

import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {
        int ans = sum1();
        int res = sum2(56, 67);
        System.out.println(ans);
        System.out.println(res);
    }

    public static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        System.out.println("The sum of two numbers " + n1 + "and " + n2 + "is" + sum);
        sc.close();
    }

    public static int sum1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        sc.close();
        return sum;
    }

    public static int sum2(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
}
