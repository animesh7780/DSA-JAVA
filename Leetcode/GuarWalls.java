public class GuarWalls {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] ref = new int[m][n];  // empty grid starts with 0

        for (int[] guard : guards) {
            int r = guard[0];
            int c = guard[1];
            ref[r][c] = 1;  // mark guard position as 1
        }

        for(int[] wall : walls){
            int r = wall[0];
            int c = wall[1];
            ref[r][c] = -1;
        }

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for(int[] guard : guards){
            int r = guard[0];
            int c = guard[1];

            for(int[] dir : directions){
                int nr = r + dir[0], nc = c + dir[1];
                while(nr >= 0 && nr < m && nc >= 0 && nc < n && ref[nr][nc] != -1 && ref[nr][nc] != 1){
                    if(ref[nr][nc] == 0){
                        ref[nr][nc] = 2;
                    }
                    nr += dir[0];
                    nc += dir[1];
                }
            }
        }
        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(ref[i][j] == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
