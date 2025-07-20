public class PeakElement {
    public int[] findPeakGrid(int[][] mat) {
        int low = 0;
        int high = mat[0].length;

        while(low <= high){
            int max = Integer.MIN_VALUE;
            int mid = low + (high - low)/2;
            int maxRow = 0;

            for(int i=0; i<mat.length;i++){
                if(mat[i][mid] > max){
                    max = mat[i][mid];
                    maxRow = i;
                } 
            }
            
            boolean isLeftSmaller = (mid == 0 || mat[maxRow][mid-1] <= mat[maxRow][mid]);
            boolean isRightSmaller = (mid == mat[0].length || mat[maxRow][mid+1] <= mat[maxRow][mid]);

            if(isLeftSmaller && isRightSmaller){
                return new int[] {maxRow ,mid};
            }
            else if(mid > 0 && mat[maxRow][mid-1] > mat[maxRow][mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
}
