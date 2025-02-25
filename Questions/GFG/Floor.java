public class Floor {
    public static void main(String[] args) {

    }

    static int findFloor(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1; // Return -1 if no floor is found

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) {
                return arr[mid];
            } else if (arr[mid] < k) {
                res = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

}
