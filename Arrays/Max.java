public class Max {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 21, 324, 543 };
        System.out.println(max(arr, 4, arr.length));
    }

    static int max(int arr[], int start, int end) {
        int maxVal = arr[start];
        for (int i = start; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
