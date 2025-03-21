import java.util.*;

public class SumandDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int prod = 1;
        int sumandPro = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            prod *= rem;
            n /= 10;
        }
        sumandPro = prod - sum;
        System.out.println(sumandPro);
        sc.close();
    }
}