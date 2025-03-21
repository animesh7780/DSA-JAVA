public class ArraySubset {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 1, 2, 3 };
        System.out.println(isSubset(a, b));
    }

    public static boolean isSubset(int a[], int b[]) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    break;
                }
                if (j == a.length - 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
