import java.util.Scanner;

public class Contest6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int n = scanner.nextInt(); // number of days
        int delay = scanner.nextInt(); // delay in days to share the secret
        int forget = scanner.nextInt(); // forgetting period in days

        // Calculate the number of people who know the secret at the end of day n
        int totalPeople = calculateSecretSpread(n, delay, forget);
        System.out.println(totalPeople);

        scanner.close();
    }

    private static int calculateSecretSpread(int n, int delay, int forget) {
        long[] peoplePerDay = new long[n + 1]; // To track new people discovering the secret
        peoplePerDay[1] = 1; // Day 1: 1 person knows the secret

        long totalPeople = 0;

        // Iterate through each day
        for (int day = 1; day <= n; day++) {
            // If there are people who discovered the secret today
            if (peoplePerDay[day] > 0) {
                // Total people who know the secret increases by the number of people who
                // discover the secret today
                totalPeople += peoplePerDay[day];
            }

            // New people discover the secret starting from delay days later
            if (day + delay <= n) {
                peoplePerDay[day + delay] += peoplePerDay[day];
            }

            // People forget the secret after `forget` days
            if (day + forget <= n) {
                totalPeople -= peoplePerDay[day + forget]; // They will not know the secret anymore
            }
        }

        return (int) totalPeople;
    }
}
