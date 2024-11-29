public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 24, 54, 543, 623, 2112 };
        int target = 623;
        System.out.println(binary(arr, target));
    }

    static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start+end)/2;
            // better way
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}