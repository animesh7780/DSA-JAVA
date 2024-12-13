public class SortedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 43, 2, 3234, 343 };
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int index) {
        if (arr.length == 1)
            return true;
        if (arr[index] > arr[index + 1])
            return false;
        return isSorted(arr, index + 1);
    }
}
