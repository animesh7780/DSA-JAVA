import java.util.Arrays;

public class SpecificSort {
    public void sortIt(int[] arr) {
        // code here
        int n = arr.length;
        int left = 0;

        //choosing the elemenys from the left side of the array and replacing
        //them with the odd numbers whenever they are found and sorting them.
        for(int i=0; i<n; i++){
            if(arr[i] %2 == 1){
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;  
            }
        }

        Arrays.sort(arr, 0, left);
        for(int i=0, j=left-1; i<j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        Arrays.sort(arr, left, n);
    }
}
