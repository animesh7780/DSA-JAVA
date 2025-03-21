public class DuplaicateArrays {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 1, 2, 3 };
        System.out.println(findUnion(a, b));
    }

    public static int findUnion(int a[], int b[]) {
        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[i] = a[i];
                }
            }
        }
    }
}
