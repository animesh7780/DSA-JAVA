public class DeleteSum {
    // public int minimumDeleteSum(String s1, String s2) {
    //     int n = s1.length();
    //     int m = s2.length();
    //     String ras = "";
    //     int suma = 0;

    //     for(int i=0; i<n; i++){
    //         char ch = s1.charAt(i);
    //         if(s2.indexOf(ch) == -1){
    //             ras += ch;
    //         }
    //     }

    //     for(int i=0; i<m; i++){
    //         char ch = s2.charAt(i);
    //         if(s1.indexOf(ch) == -1) ras += ch;
    //     }

    //     for(int i=0; i<ras.length(); i++){
    //         suma += (int) ras.charAt(i);
    //     }
    //     return suma;
    // }

        public int minimumDeleteSum(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = n - 1; i >= 0; i--) {
            dp[i][m] = dp[i + 1][m] + s1.charAt(i);
        }
        for (int j = m - 1; j >= 0; j--) {
            dp[n][j] = dp[n][j + 1] + s2.charAt(j);
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1];
                } else {
                    dp[i][j] = Math.min(
                        s1.charAt(i) + dp[i + 1][j],
                        s2.charAt(j) + dp[i][j + 1]
                    );
                }
            }
        }
        return dp[0][0];
    }

}
