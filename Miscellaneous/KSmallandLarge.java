import java.util.ArrayList;

public class KSmallandLarge {
    public int[] findLargeandSmall(int[] arr, int k) {
        int n = arr.length;
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();

        // classify
        for (int v : arr) {
            if (v < k) less.add(v);
            else if (v > k) greater.add(v);
            else equal.add(v);
        }

        // write back to full array
        int idx = 0;
        for (int v : less)    arr[idx++] = v;
        for (int v : greater) arr[idx++] = v;
        for (int v : equal)   arr[idx++] = v;

        return arr;
    }

}
