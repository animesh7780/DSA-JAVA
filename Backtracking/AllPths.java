import java.util.Arrays;

public class AllPths {
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        paths(0, 0, maze, "");
        int[][] path = new int[maze.length][maze[0].length];
        pathsprint("", 0, 0, maze, path, 1);
    }

    static void paths(int row, int col, boolean[][] maze, String path) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        // Mark the cell as visited
        maze[row][col] = false;

        if (row < maze.length - 1)
            paths(row + 1, col, maze, path + "D");
        if (col < maze[0].length - 1)
            paths(row, col + 1, maze, path + "R");
        if (row > 0)
            paths(row - 1, col, maze, path + "U");
        if (col > 0)
            paths(row, col - 1, maze, path + "L");

        // Backtrack
        // reset the cell to true
        maze[row][col] = true;
    }

    static void pathsprint(String p, int row, int col, boolean[][] maze, int[][] path, int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for (int[] nums : path) {
                System.out.println(Arrays.toString(nums));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        // Mark the cell as visited
        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length - 1)
            pathsprint(p + 'D', row + 1, col, maze, path, step + 1);
        if (col < maze[0].length - 1)
            pathsprint(p + 'R', row, col + 1, maze, path, step + 1);
        if (row > 0)
            pathsprint(p + 'U', row - 1, col, maze, path, step + 1);
        if (col > 0)
            pathsprint(p + 'L', row, col - 1, maze, path, step + 1);

        // Backtrack
        // reset the cell to true
        maze[row][col] = true;
        path[row][col] = 0;
    }
}
