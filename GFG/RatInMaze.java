import java.util.ArrayList;

public class RatInMaze {
    private int n;
    private ArrayList<String> res;

    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        n = maze.length;
        boolean[][] markPath = new boolean[n][n];
        res = new ArrayList<>();
        backtrack(maze, 0, 0, markPath , "");

        return res;
    }

    public void backtrack(int[][] maze, int x, int y, boolean[][] markPath, String path){
        if(x<0 || y<0 || x>=n || y>=n || maze[x][y] == 0 || markPath[x][y]){
            return;
        }

        //destination reached
        if(x == n-1 && y == n-1){
            res.add(path);
            return;
        }

        //Mark current as part of path
        markPath[x][y] = true;

        // Move Down
        backtrack(maze, x + 1, y, markPath, path + "D");

        // Move Left
        backtrack(maze, x, y - 1, markPath, path + "L");

        // Move Right
        backtrack(maze, x, y + 1, markPath, path + "R");

        // Move Up
        backtrack(maze, x - 1, y, markPath, path + "U");


        //backtrack
        markPath[x][y] = false;
    }
}
