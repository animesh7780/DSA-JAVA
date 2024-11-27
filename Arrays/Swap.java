public class Swap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        swap(arr, 0, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
