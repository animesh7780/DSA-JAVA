import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();
        double circumference = circum(radius);
        System.out.println("The circumference of the circle is: " + circumference);
        scanner.close();
    }

    static double circum(int r) {
        return 2 * (Math.PI) * r;
    }
}
