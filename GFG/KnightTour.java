import java.util.ArrayList;

public class KnightTour {
    public ArrayList<ArrayList<Integer>> knightTour(int n) {
        // Special case: n = 1 trivial tour
        if (n == 1) {
            ArrayList<ArrayList<Integer>> board = new ArrayList<>();
            ArrayList<Integer> row = new ArrayList<>();
            row.add(0);
            board.add(row);
            return board;
        }

        // For n = 2, 3, 4, return empty list since no valid tour exists
        if (n > 1 && n < 5) {
            return new ArrayList<>();
        }

        int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

        ArrayList<ArrayList<Integer>> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(-1);
            }
            board.add(row);
        }

        // Start the Knight's tour from (0, 0)
        board.get(0).set(0, 0);

        if (solveKnightTour(0, 0, 1, n, board, dx, dy)) {
            return board;
        }

        return new ArrayList<>(); // no solution found
    }

    private boolean solveKnightTour(int x, int y, int step, int n,
                                    ArrayList<ArrayList<Integer>> board,
                                    int[] dx, int[] dy) {
        if (step == n * n) {
            return true;
        }

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isValid(nx, ny, n, board)) {
                board.get(nx).set(ny, step);
                if (solveKnightTour(nx, ny, step + 1, n, board, dx, dy)) {
                    return true;
                }
                board.get(nx).set(ny, -1); // backtrack
            }
        }
        return false;
    }

    private boolean isValid(int x, int y, int n, ArrayList<ArrayList<Integer>> board) {
        return x >= 0 && y >= 0 && x < n && y < n && board.get(x).get(y) == -1;
    }
}
