import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class MaxInMinWinow {
    public static ArrayList<Integer> maxOfMin(int[] arr) {
        int n = arr.length;
        int[] left = new int[n], right = new int[n];
        Deque<Integer> st = new ArrayDeque<>();

        // previous smaller (strict)
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        // next smaller (strict)
        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        int[] best = new int[n + 1]; // 1..n
        for (int i = 0; i < n; i++) {
            int len = right[i] - left[i] - 1;
            if (arr[i] > best[len]) best[len] = arr[i];
        }

        for (int len = n - 1; len >= 1; len--) {
            if (best[len] < best[len + 1]) best[len] = best[len + 1];
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int k = 1; k <= n; k++) ans.add(best[k]);
        return ans;
    }

}
