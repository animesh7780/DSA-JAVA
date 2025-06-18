public class TimesRoatated {
    int findTimesRotated(int[] arr){
        int n = arr.length;
        if (n <= 1) return 0;
        
        int start = 0, end = n - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Safe bounds checking
            if (mid > 0 && mid < n-1) {  // Ensure mid+1 and mid-1 are valid
                if (arr[mid] <= arr[mid+1] && arr[mid] <= arr[mid-1]) {
                    return mid;
                }
            }
            
            // Handle edge cases separately
            if (mid == 0) {
                if (arr[0] <= arr[1] && arr[0] <= arr[n-1]) return 0;
            }
            if (mid == n-1) {
                if (arr[n-1] <= arr[0] && arr[n-1] <= arr[n-2]) return n-1;
            }
            
            // Binary search logic
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }
}
