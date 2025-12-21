public class DeleteColomns {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();
        int ans = 0;

        for(int col=0; col<m; col++){
            for(int row=1; row<n; row++){
                if(strs[row].charAt(col) < strs[row-1].charAt(col)){
                    ans += 1;
                    break;
                }
            }
        }
        return ans;
    }
}
