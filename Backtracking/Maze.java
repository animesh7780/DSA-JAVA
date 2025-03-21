import java.lang.reflect.Array;
import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        path(3, 3, "");
        System.out.println(path(3, 3));
        System.out.println(pathdiagonal(3, 3));
        boolean[][] maze = {
                { true, true, true, true },
                { true, false, true, true },
                { true, true, true, true }
        };
        pathWithObstacle(0, 0, maze, "");
    }

    static int count(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        return count(row - 1, col) + count(row, col - 1);
    }

    static void path(int row, int col, String path) {
        if (row == 1 && col == 1) {
            System.out.println(path);
            return;
        }
        if (row > 1)
            path(row - 1, col, path + "D");
        if (col > 1)
            path(row, col - 1, path + "R");
    }

    static ArrayList<String> path(int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        ArrayList<String> myResult = new ArrayList<>();
        if (row > 1) {
            ArrayList<String> recResult = path(row - 1, col);
            for (String s : recResult) {
                myResult.add("D" + s);
            }
        }
        if (col > 1) {
            ArrayList<String> recResult = path(row, col - 1);
            for (String s : recResult) {
                myResult.add("R" + s);
            }
        }
        return myResult;
    }

    static ArrayList<String> pathdiagonal(int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        ArrayList<String> myResult = new ArrayList<>();
        if (row > 1) {
            ArrayList<String> recResult = pathdiagonal(row - 1, col);
            for (String s : recResult) {
                myResult.add("D" + s);
            }
        }
        if (col > 1) {
            ArrayList<String> recResult = pathdiagonal(row, col - 1);
            for (String s : recResult) {
                myResult.add("R" + s);
            }
        }
        if (row > 1 && col > 1) {
            ArrayList<String> recResult = pathdiagonal(row - 1, col - 1);
            for (String s : recResult) {
                myResult.add("X" + s);
            }
        }
        return myResult;
    }

    static void pathWithObstacle(int row, int col, boolean[][] maze, String path) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        if (row < maze.length - 1)
            pathWithObstacle(row + 1, col, maze, path + "D");
        if (col < maze[0].length - 1)
            pathWithObstacle(row, col + 1, maze, path + "R");
    }
}