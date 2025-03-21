import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        evenOrOdd(n);
        sc.close();
    }

    static void evenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
