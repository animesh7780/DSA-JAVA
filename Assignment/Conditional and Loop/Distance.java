import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter odo at start");
        int dist1 = sc.nextInt();
        System.out.println("Enter odo at end");
        int dist2 = sc.nextInt();
        int dist = dist2 - dist1;
        System.out.println("Distance = " + dist);
        sc.close();
    }
}
