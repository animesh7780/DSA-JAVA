import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Xsum {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int[] freq = new int[51]; // frequency array for nums values up to 50

            // Initialize frequency for first window
        for (int i = 0; i < k; i++) {
            freq[nums[i]]++;
        }

        for (int i = 0; i <= n - k; i++) {
                // Build map from freq array
            Map<Integer, Integer> map = new HashMap<>();
            for (int val = 1; val <= 50; val++) {
                if (freq[val] > 0) {
                    map.put(val, freq[val]);
                }
            }

                // Convert map entries to array for sorting
            Map.Entry<Integer, Integer>[] entries = map.entrySet().toArray(new Map.Entry[0]);
            Arrays.sort(entries, (a, b) -> {
                if (!b.getValue().equals(a.getValue())) {
                    return b.getValue() - a.getValue(); // frequency desc
                }
                return b.getKey() - a.getKey(); // value desc if tie
            });

            int sum = 0;
            if (entries.length < x) {
                    // fewer than x distinct elements, sum all in the window
                for (int j = i; j < i + k; j++) {
                    sum += nums[j];
                }
            } else {
                    // sum top x frequent elements (value * frequency)
                for (int j = 0; j < x; j++) {
                    sum += entries[j].getKey() * entries[j].getValue();
                }
            }
            result[i] = sum;

                // Slide the window frequency update
            if (i + k < n) {
                freq[nums[i]]--;
                freq[nums[i + k]]++;
            }
        }

        return result;
    }
}
