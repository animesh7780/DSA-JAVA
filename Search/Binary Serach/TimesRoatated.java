public class TimesRoatated {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(new TimesRoatated().countPivot(arr));
    }

    public int countPivot(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    public int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // 4 cases
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1] && mid < end) { // mid<end is important
                return mid;
            }
            if (arr[mid] < arr[mid - 1] && mid > start) { // mid>start is important
                return mid - 1;
            }
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
