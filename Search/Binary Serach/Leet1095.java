public class Leet1095 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 3, 1 };
        int target = 3;
        System.out.println(new Leet1095().searchInMountain(arr, target));
    }

    public int searchInMountain(int[] arr, int target) {
        int peak = findPeakIndex(arr);
        int firstTry = binary(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    public int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int binary(int[] arr, int target, int start, int end) {

        while (start <= end) {
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

    static int binarySearch(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

}
