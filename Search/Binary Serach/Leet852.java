public class Leet852 {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 0 };
        System.out.println(new Leet852().peakIndex(arr));
    }

    public int peakIndex(int[] arr) {
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
}
