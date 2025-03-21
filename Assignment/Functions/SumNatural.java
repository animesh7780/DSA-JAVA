import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.println("Enter a positive number: ");
            n = sc.nextInt();
            n++;
        }
        System.out.println(sum(n));
        sc.close();
    }

    static int sum(int n) {
        for (int i = 1; i <= n; i++) {
            n = n + i;
        }
        return n;
    }
}
