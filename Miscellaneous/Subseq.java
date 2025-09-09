import java.util.ArrayList;

public class Subseq {
    public static ArrayList<Integer> findSubseq(int[] arr, int k) {
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            // Only add if it doesn't push sum over k
            if (arr[i] <= k && sum + arr[i] <= k) {
                sum += arr[i];
                ans.add(arr[i]);
            }
            // If element is too large or would exceed k, skip it
        }
        return ans;
    }

}
