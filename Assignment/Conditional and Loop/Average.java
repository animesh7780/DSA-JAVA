import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input. The number of elements must be greater than 0.");
            sc.close();
            return;
        }

        double sum = 0;

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            sum += sc.nextDouble();
        }

        double average = sum / n;
        System.out.println("The average is: " + average);

        sc.close();
    }
}
