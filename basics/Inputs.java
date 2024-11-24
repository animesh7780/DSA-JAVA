import java.util.*;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("pl enter the number: ");
        System.out.println("pl enter your name");
        int a = sc.nextInt();
        String name = sc.nextLine();
        System.out.println("number:" + a);
        System.out.println("Name: " + name);
        sc.close();
    }
}