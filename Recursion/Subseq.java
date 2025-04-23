import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 2 };
        int n = arr.length;
        ArrayList<Integer> output = new ArrayList<>();
        printSubseq(arr, n, 0, output);
    }

    public static void printSubseq(int arr[], int n, int ind, ArrayList<Integer> output) {
        if (ind == n) {
            for (int i = 0; i < output.size(); i++) {
                System.out.print(output.get(i) + " ");
            }
            System.out.println();
            return;
        }

        // take or pick thr required susequence

        output.add(arr[ind]);
        printSubseq(arr, n, ind + 1, output);
        output.remove(output.size() - 1);

        // not pick the element

        printSubseq(arr, n, ind + 1, output);
    }
}
