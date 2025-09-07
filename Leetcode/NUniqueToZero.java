import java.util.Arrays;

public class NUniqueToZero {
    public static int[] sumZeroFormula(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = 2*i - n + 1;
        return arr;
    }

    public static void main(String[] args) {
        int[] tests = {1, 2, 3, 4, 5, 6};
        for (int n : tests) {
            int[] res = sumZeroFormula(n);
            System.out.println("n=" + n + " -> " + Arrays.toString(res));
        }
    }
}
