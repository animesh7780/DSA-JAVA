import java.util.Arrays;

public class leet647 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 4, 5, 6, 7, 8, 9, 10 };
        int[] ans = new leet647().lossingNumber(arr);
        System.out.println(Arrays.toString(ans));

    }

    public int[] lossingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return new int[] { arr[j], j + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
