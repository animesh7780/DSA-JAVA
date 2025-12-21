public class DeleteColomnsII {
    public int minDeletionSize(String[] strs) {
        if(strs == null || strs.length <= 1) return 0;
        
        int n = strs.length;
        int m = strs[0].length();
        int del = 0;
        boolean[] sortedP = new boolean[n-1];

        for(int col=0; col<m; col++){
            boolean sd = false;
            for(int row=0; row<n-1; row++){
                if(!sortedP[row] && strs[row].charAt(col) > strs[row+1].charAt(col)){
                    del++;
                    sd = true;
                    break;
                }
            }
            if(sd) continue;

            for(int i=0; i<n-1; i++){
                if(strs[i].charAt(col) < strs[i+1].charAt(col)){
                    sortedP[i] = true;
                }
            }
        }
        return del;
    }
}
