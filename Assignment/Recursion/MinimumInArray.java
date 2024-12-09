public class MinimumInArray {
    public static void main(String[] args) {
        int arr[] = { -6, 2, 3, 4, 5 };
        int n = arr.length;
        System.out.println(min(arr, n));
    }

    static int min(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], min(arr, n - 1));
    }
}