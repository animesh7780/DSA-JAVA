package Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        sum(4, 342, 42, 33, 34423, 32);
        multiple(23, 23, 12, 23, 12, 32132, 312, 312323);
    }

    static void multiple(int a, int b, int... v) {
        System.out.println(a * b);
        System.out.println(Arrays.toString(v));
    }

    static void sum(int... v) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(v));
    }
}