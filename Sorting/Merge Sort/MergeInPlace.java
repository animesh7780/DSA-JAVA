import java.util.Arrays;

public class MergeInPlace {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        merge(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void merge(int[] arr, int s, int e) {
        if (e - s == 1) { // Base case: single element segment
            return;
        }

        int m = (s + e) / 2; // Find the middle index

        merge(arr, s, m); // Sort the first half
        merge(arr, m, e); // Sort the second half

        mergeInPlace(arr, s, m, e); // Merge the two halves
    }

    static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s]; // Temporary array for merging
        int i = s; // Pointer for the first half
        int j = m; // Pointer for the second half
        int k = 0; // Pointer for the merged array

        // Merge elements from both halves
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the first half
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements from the second half
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // Copy the merged elements back to the original array
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
