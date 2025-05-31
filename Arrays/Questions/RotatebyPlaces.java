// public class RotatebyPlaces {
//     public static void main(String[] args) {
        
//     }
//     public static void rotate(int[] arr, int n, int d){
//         d = d%n;
//         int size = d;
//         int temp[size];
//     }
// }

//optimal

public class RotatebyPlaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int d = 2; 
        leftRotate(arr, n, d);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void leftRotate(int[] arr, int n, int d){
        d = d%n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
