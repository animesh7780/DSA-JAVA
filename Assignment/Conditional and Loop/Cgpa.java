import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks for subject " + i + ": ");
            double marks = sc.nextDouble();
            sum += marks;
        }
        double cgpa = sum / n * 10;
        System.out.println("Your CGPA is: " + cgpa);
        sc.close();
    }
}
