public class PeakElement {
    public static void main(String[] args) {
        
    }
    public static int findPeak(int[] arr){
        int n = arr.length;
        if(n == 1) return 0;

        if(arr[0] > arr[1]){
            return 0;
        }

        else if(arr[n-1] > arr[n-2]){
            return n-1;
        }

        int low = 1;
        int high = n-2;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(arr[mid] < arr[mid+1]){
                low = mid + 1;
            }
            else if(arr[mid] < arr[mid-1]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
