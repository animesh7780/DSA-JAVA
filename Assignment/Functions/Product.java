import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for there product: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(pro(a, b));
        sc.close();
    }

    static int pro(int a, int b) {
        return a * b;
    }
}