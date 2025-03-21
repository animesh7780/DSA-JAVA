public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[5][5];
        System.out.println(quenns(board, 0));
    }

    static int quenns(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board[0].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += quenns(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check coloumn
        for (int i = row; i >= 0; i--) {
            if (board[i][col]) {
                return false;
            }
        }
        // check left diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // check right diagonal
        int maxRight = Math.min(row, board[0].length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print(cell ? "Q" : "X");
            }
            System.out.println();
        }
        System.out.println();
    }
}
