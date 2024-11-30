public class Bubble {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 30, 10 };
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void bubbleSort(int[] arr) {
        boolean Swapped;
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i <= n - 1; i++) {
            Swapped = false;
            for (int j = 1; j <= n - i - 1; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    Swapped = true;
                }
            }
            if (!Swapped)
                break; // help break after one pass
        }
    }
}