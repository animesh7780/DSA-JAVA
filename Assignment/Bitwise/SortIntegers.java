import java.util.*;

public class SortIntegers {
    public static void main(String[] args) {
        int nums[] = { 4, 2, 1, 3 };
        System.out.println(sortArray(nums));
    }

    static int[] sortArray(int[] arr) {
        Arrays.sort(arr, (a, b) -> {
            int countA = Integer.bitCount(a); // Count of 1's in binary of a
            int countB = Integer.bitCount(b); // Count of 1's in binary of b

            // If counts are the same, sort by numerical order
            if (countA == countB) {
                return Integer.compare(a, b);
            }
            // Otherwise, sort by count of 1's
            return Integer.compare(countA, countB);
        });

        return arr;
    }
}
