import java.util.ArrayList;

public class SubmatrixSum {
    public ArrayList<Integer> prefixSum2D(int[][] mat, int[][] queries) {
        // code here
        int[][] prefixSum = buildPrefix(mat);
        ArrayList<Integer> ans = new ArrayList<>();

        for(int[] query : queries){
            int r1 = query[0], c1 = query[1];
            int r2 = query[2], c2 = query[3];

            ans.add(getSubmatrixSum(prefixSum, r1, c1, r2, c2));
        }
        return ans;
    }

    public static int[][] buildPrefix(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int[][] prefixSum = new int[n+1][m+1];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                prefixSum[i][j] = mat[i-1][j-1] + 
                                prefixSum[i-1][j] + 
                                prefixSum[i][j-1] - 
                                prefixSum[i-1][j-1];
            }
        }
        return prefixSum;
    }

    public int getSubmatrixSum(int[][] prefixSum, int r1, int c1, int r2, int c2){
        return prefixSum[r2+1][c2+1] - prefixSum[r1][c2+1] - prefixSum[r2+1][c1] + prefixSum[r1][c1];
    }
}
