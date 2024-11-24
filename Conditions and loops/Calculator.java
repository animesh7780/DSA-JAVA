import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char op = sc.next().trim().charAt(0);
            if (op == 'x' || op == 'X') {
                System.out.println("Exiting");
                break;
            }
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (op == '+') {
                    System.out.println(a + b);
                } else if (op == '-') {
                    System.out.println(a - b);
                } else if (op == '*') {
                    System.out.println(a * b);
                } else if (op == '/') {
                    System.out.println(a / b);
                } else if (op == '%') {
                    System.out.println(a % b);
                } else {
                    System.out.println("Invalid operator");
                }
            }
        }
        sc.close();
    }
}
