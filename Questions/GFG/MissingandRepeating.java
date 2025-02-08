import java.util.ArrayList;
import java.util.Arrays;

public class MissingandRepeating {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 2, 1, 1 };
        System.out.println(findTwoElement(arr));
    }

    public static ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        int repeated = -1, missing = -1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                repeated = arr[i];
                break;
            }
        }

        int i = 0;
        while (i < n) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) {
                missing = j + 1;
                break;
            }
        }

        return new ArrayList<>(Arrays.asList(repeated, missing));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
