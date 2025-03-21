public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 5;
        System.out.println(binary(arr, target, 0, arr.length - 1));
    }

    static int binary(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binary(arr, target, mid + 1, e);
        } else {
            return binary(arr, target, s, mid - 1);
        }
    }
}
