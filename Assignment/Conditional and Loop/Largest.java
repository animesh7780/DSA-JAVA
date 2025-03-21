import java.util.*;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        while (true) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            max = Math.max(max, n);
        }
        System.out.println(max);
        sc.close();
    }
}
