import java.util.ArrayList;

public class PeakElementIn2D {
    public ArrayList<Integer> findPeakGrid(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int low = 0, high = m - 1;
        int min = Integer.MIN_VALUE;

        while(low <= high){
            int mid = low + (high - low)/2;

            int maxRow = 0;
            for(int i=0; i<n; i++){
                if(mat[i][mid] == mat[maxRow][mid]){
                    maxRow = i;
                }
            }
            int curr = mat[maxRow][mid];
            int left = (mid > 0) ? mat[maxRow][mid - 1] : min;
            int right = (mid < m - 1) ? mat[maxRow][mid + 1] : min;

            if (curr >= left && curr >= right) {
                // Found a peak
                ArrayList<Integer> res = new ArrayList<>();
                res.add(maxRow);
                res.add(mid);
                return res;
            } else if (left > curr) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(-1);
        res.add(-1);
        return res;
    }
}
