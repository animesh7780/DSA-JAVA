public class DuplicateRotatedArray {
    public static void main(String[] args) {

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
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
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
