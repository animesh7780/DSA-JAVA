public class MaxMatrixSum {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int minNeg = Integer.MAX_VALUE;
        int cn = 0;
        long sum = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int val = matrix[i][j];
                int absVal = Math.abs(val);
                sum += absVal;

                if(val < 0){
                    cn++;
                }

                if(absVal < minNeg){
                    minNeg = absVal;
                }
            }
        }
        if(cn % 2 == 0){
            return sum;
        }
        return sum - 2L * minNeg;
    }
}
