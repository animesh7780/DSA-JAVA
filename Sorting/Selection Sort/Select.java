public class Select {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 78, 21, 4 };
        SelectionSortr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void SelectionSortr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
