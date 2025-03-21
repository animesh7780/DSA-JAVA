public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = { 3762, 387, 83, 72, 934 };
        System.out.println(searchInRange(arr, 72, 1, 4));
    }

    static boolean searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return false;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
