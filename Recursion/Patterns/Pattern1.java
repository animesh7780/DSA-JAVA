import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        pattern1(4, 0);
        int[] arr = { 4, 3, 2, 1 };
        bubbleSort(arr.length - 1, 0, arr);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr.length - 1, 0, arr);
        System.out.println(Arrays.toString(arr));
    }

    static void pattern1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            pattern1(r, c + 1);
        } else {
            pattern1(r - 1, c);
            System.out.println();
        }
    }

    static void bubbleSort(int r, int c, int[] arr) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubbleSort(r, c + 1, arr);
        } else {

            bubbleSort(r - 1, 0, arr);
        }
    }

    static void selectionSort(int r, int c, int[] arr, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selectionSort(r, c + 1, arr, c);
            }else {
            selectionSort(r - 1, 0, arr,max);
        }
    }
}