import java.util.ArrayList;
import java.util.List;

public class Leet1539 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        Leet1539 obj = new Leet1539();
        System.out.println(obj.findKthPositive(arr, k));
    }

    public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int missing = arr[mid] - (mid + 1);
            if (k > missing) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start + k;
    }
}
