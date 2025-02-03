public class Floor {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 10, 11, 12, 19 };
        int k = 5;
        System.out.println(findFloor(arr, k));
    }

    static int findFloor(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
