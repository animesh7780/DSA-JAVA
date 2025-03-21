import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        Max(n1, n2, n3);
        Min(n1, n2, n3);
        sc.close();
    }

    static void Max(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println("The maximum number is " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("The maximum number is " + n2);
        } else {
            System.out.println("The maximum number is " + n3);
        }
    }

    static void Min(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            System.out.println("The minimum number is " + n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("The minimum number is " + n2);
        } else {
            System.out.println("The minimum number is " + n3);
        }
    }
}