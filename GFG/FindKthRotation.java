public class FindKthRotation {
    public int findKRotation(int arr[]) {
        // Code here
        int n = arr.length;

        int low = 0, high = n-1;

        while(low <= high){

            if(arr[low] <= arr[high]) return low;

            int mid = low + (high - low)/2;
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;

            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
                return mid;
            }

            else if(arr[mid] >= arr[low]){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }
        return 0;
    }
}
