import java.util.ArrayList;

public class CountXinRange {
    public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        for(int query[] : queries){
            int l = query[0];
            int r = query[1];
            int x = query[2];

            int first = lowerBound(arr, n, x);
            int lastP = upperBound(arr, n, x);
            int last = lastP - 1;

            int left = Math.max(first, l);
            int right = Math.min(last, r);
            int count = (left <= right) ? right - left + 1 : 0;

            res.add(count);
        }
        return res;
    }

    public int lowerBound(int[] arr, int n, int x){
        int low = 0, high = n-1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] >= x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public int upperBound(int[] arr, int n, int x){
        int low = 0, high = n-1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
