import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter hypotenuze");
        int h = sc.nextInt();
        System.out.println("enter base");
        int b = sc.nextInt();
        System.out.println("enter perpendicular");
        int p = sc.nextInt();
        pytho(p, b, h);
        sc.close();
    }

    static void pytho(int p, int b, int h) {
        int lhs = h * h;
        int rhs = b * b + p * p;
        if (lhs == rhs) {
            System.out.println("Pythogorean Confirmed");
        } else {
            System.out.println("Not Pythogorean");
        }
    }
}
