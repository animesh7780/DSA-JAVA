public class ReverseArray {
    void reverseArray(int[] arr, int start, int end){
        int n = arr.length;

        if(start >= end) return;

        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;

        reverseArray(arr, 0, n-1);
    }

}
