public class NoZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            int j = n - i;
            if (!(i%10 == 0) && !(j%10 == 0)) {
                return new int[] { i, j };
            }
        }
        return new int[] { -1, -1 };
    }
}
