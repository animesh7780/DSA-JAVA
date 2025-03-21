import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Candidate 1 Scores:");
        List<Integer> candidateOne = new ArrayList<>();
        String[] candidateOneInput = scanner.nextLine().split(" ");
        for (String s : candidateOneInput) {
            candidateOne.add(Integer.parseInt(s));
        }

        System.out.println("Enter Candidate 2 Scores:");
        List<Integer> candidateTwo = new ArrayList<>();
        String[] candidateTwoInput = scanner.nextLine().split(" ");
        for (String s : candidateTwoInput) {
            candidateTwo.add(Integer.parseInt(s));
        }
        scanner.close();

        if (candidateOne.size() != candidateTwo.size()) {
            System.out.println("Error: Both participants must have the same number of scores.");
            return;
        }

        int candidateOnePoints = 0;
        int candidateTwoPoints = 0;

        for (int i = 0; i < candidateOne.size(); i++) {
            if (candidateOne.get(i) > candidateTwo.get(i)) {
                candidateOnePoints++;
            } else if (candidateOne.get(i) < candidateTwo.get(i)) {
                candidateTwoPoints++;
            }
        }

        System.out.println("Output: " + candidateOnePoints + " " + candidateTwoPoints);

    }
}
