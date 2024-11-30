public class Current {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = 3;
        current(arr, n);
    }

    static void current(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < n) {
                count++;
            }
        }
        System.out.println(count);
    }
}
