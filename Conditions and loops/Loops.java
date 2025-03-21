//import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // print nimbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Scanner sc = new Scanner(System.in);
        // // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // System.out.println(i);
        // }
        // // print hello world n number of times
        // for (int i = 1; i <= n; i++) {
        // System.out.println("Hello World");
        // }

        // while loops

        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // do while

        int num = 1;
        do {
            System.out.println(i);
            num++;
        } while (num < 5);

    }
}
