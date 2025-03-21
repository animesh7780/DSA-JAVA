package Methods;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        greet();
        System.out.println("Enter your name: ");
        String name1 = sc.nextLine();
        String name = greet(name1);
        System.out.println(name);
        sc.close();
    }

    public static void greet() {
        System.out.println("Hello World");
    }

    public static String greet(String name) {
        return "Hello " + name;
    }

}
