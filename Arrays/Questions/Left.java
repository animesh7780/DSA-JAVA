public class Left {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        rotateArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void rotateArray(int arr[]) {
        int n = arr.length;
        if (n == 0) return;
        int temp = arr[0]; 
        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i]; 
        }
        arr[n - 1] = temp; 
    }
}