public class NGEtoRight {
    int countNGES(int[] arr, int index){
        int count = 0;
        int n = arr.length;

        for(int i=index+1; i<n-1; i++){
            if(arr[index] < arr[i]){
                count++;
            }
        }
        return count;
    }
}
