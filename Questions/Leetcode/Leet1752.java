public class Leet1752 {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 4, 5, 1, 2, 3 };
        System.out.println(new Leet1752().check(arr));
    }

    public boolean check(int[] arr) {
        int n = arr.length;
        int countBreaks = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                countBreaks++;
            }
        }

        if (arr[n - 1] > arr[0]) {
            countBreaks++;
        }

        boolean allSame = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[0]) {
                allSame = false;
                break;
            }
        }

        return allSame || countBreaks == 1;
    }
}
