import java.util.*;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("a is largest");
        } else if (b > a && b > c) {
            System.out.println("b is largest");
        } else {
            System.out.println("c is largest");
        }
        int mas = Math.max(c, Math.max(a, b));
        System.out.println(mas);

        sc.close();
    }
}
