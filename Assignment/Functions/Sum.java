import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for there sum: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a, b));
        sc.close();
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
