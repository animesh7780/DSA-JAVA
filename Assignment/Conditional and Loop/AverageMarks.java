import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int n = sc.nextInt();
        int sum = 0;
        int avg = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            sum += marks;
            avg = sum / n;
        }
        System.out.println("Your average marks is: " + avg);
        sc.close();
    }
}
