public class EleLessThanK {
    public int countLessEqual(int[] arr, int x) {
        // code here
        int pivot = findPivot(arr);
        int n = arr.length;
        int left = countInSorted(arr, pivot, n-1, x);
        int right = countInSorted(arr, 0, pivot-1, x);

        return left + right;

    }

    public int findPivot(int[] arr) {
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public int countInSorted(int[] arr, int left, int right, int x){
        if(left > right) return 0;
        int start = left, end = right;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] <= x) start = mid+1;
            else end = mid - 1;
        }
        return start - left;
    }

}
