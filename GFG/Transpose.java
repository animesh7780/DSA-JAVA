import java.util.ArrayList;

public class Transpose {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int n = mat.length;        // rows
        int m = mat[0].length;     // columns
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        // Create m empty inner lists (one per new row/column)
        for(int col = 0; col < m; col++) {
            ans.add(new ArrayList<Integer>());
        }
        
        // Fill each new row with original column elements
        for(int col = 0; col < m; col++) {
            for(int row = 0; row < n; row++) {
                ans.get(col).add(mat[row][col]);
            }
        }
        return ans;
    }
}
