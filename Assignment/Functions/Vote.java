import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        vote(age);
        sc.close();
    }

    static void vote(int age) {
        if (age >= 18 && age <= 100) {
            System.out.println("You are eligible to vote");
        } else if (age > 100) {
            System.out.println("You are not from this world");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
