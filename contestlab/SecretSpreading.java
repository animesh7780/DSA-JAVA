import java.util.Scanner;

public class SecretSpreading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int delay = scanner.nextInt();
        int forget = scanner.nextInt();

        scanner.close();

        int peopleKnowingSecret = 1;
        int currentDay = 0;
        int forgetDay = delay + forget;

        for (currentDay = 1; currentDay <= days; currentDay++) {
            if (currentDay >= delay && currentDay < forgetDay) {
                peopleKnowingSecret++;
            }

            if (currentDay == forgetDay) {
                peopleKnowingSecret--;
                forgetDay += forget;
            }
        }

        System.out.println(peopleKnowingSecret);
    }
}