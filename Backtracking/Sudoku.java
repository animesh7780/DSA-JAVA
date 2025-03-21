import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {
        int[][] board = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 0, 0, 1, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("No Solution");
        }
    }

    static boolean solve(int[][] board) {
        int row = -1, col = -1;
        boolean isEmpty = true;

        // Find an empty cell
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty)
                break;
        }

        // If no empty cell, puzzle is solved
        if (isEmpty)
            return true;

        // Try numbers from 1 to 9
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num; // Tentative assignment
                if (solve(board))
                    return true; // Recursively solve
                board[row][col] = 0; // Backtrack
            }
        }
        return false; // Trigger backtracking
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num)
                return false;
        }

        // Check column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num)
                return false;
        }

        // Check subgrid
        int sqrt = (int) Math.sqrt(board.length); // Size of subgrid
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;
        for (int r = boxRowStart; r < boxRowStart + sqrt; r++) {
            for (int c = boxColStart; c < boxColStart + sqrt; c++) {
                if (board[r][c] == num)
                    return false;
            }
        }

        return true;
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}
