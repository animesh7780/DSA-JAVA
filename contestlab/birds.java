import java.util.*;

public class birds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of plant sightings:");
        int n = scanner.nextInt();

        int[] sightings = new int[n];

        System.out.println("Enter the plant IDs:");
        for (int i = 0; i < n; i++) {
            sightings[i] = scanner.nextInt();
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int id : sightings) {
            frequencyMap.put(id, frequencyMap.getOrDefault(id, 0) + 1);
        }

        int mostCommonID = Integer.MAX_VALUE;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int id = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency || (frequency == maxFrequency && id < mostCommonID)) {
                mostCommonID = id;
                maxFrequency = frequency;
            }
        }

        System.out.println("The most common plant ID is: " + mostCommonID);

        scanner.close();
    }
}
