public class Sort012 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 1, 2, 0, 1, 2 };
        Sort012 obj = new Sort012();
        obj.sort012(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void sort012(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void sort(int[] arr) {

    }
}
