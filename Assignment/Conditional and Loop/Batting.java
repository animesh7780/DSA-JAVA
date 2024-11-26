import java.util.Scanner;

public class Batting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total runs scored: ");
        int totalRuns = sc.nextInt();

        System.out.println("Enter the total times out: ");
        int timesOut = sc.nextInt();

        if (timesOut <= 0) {
            System.out
                    .println("Invalid input! Total times out must be greater than 0 to calculate the batting average.");
        } else {
            double battingAverage = (double) totalRuns / timesOut;
            System.out.println("The batting average is: " + battingAverage);
        }

        sc.close();
    }
}
