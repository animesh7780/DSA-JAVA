import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinTimeDifference {
public int findMinDifference(List<String> timePoints) {
    List<Integer> minutesList = new ArrayList<>();

    for (String time : timePoints) {
        String[] parts = time.split(":");
        int hrs = Integer.parseInt(parts[0]);
        int mins = Integer.parseInt(parts[1]);
        minutesList.add(hrs * 60 + mins);
    }

    Collections.sort(minutesList);

    int minDiff = Integer.MAX_VALUE;

    for (int i = 1; i < minutesList.size(); i++) {
        int diff = minutesList.get(i) - minutesList.get(i - 1);
        minDiff = Math.min(minDiff, diff);
    }

    // Wrap around case (midnight difference)
    int wrapDiff = 1440 - (minutesList.get(minutesList.size() - 1) - minutesList.get(0));
    minDiff = Math.min(wrapDiff, minDiff);

    return minDiff;
}


}
