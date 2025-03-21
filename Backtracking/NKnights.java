public class NKnights {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        knight(board, 0, 0, 4);
    }

    static void knight(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }
        if (row == board.length - 1 && col == board.length) {
            return;
        }
        if (col == board.length) {
            knight(board, row + 1, 0, knights);
            return;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
        knight(board, row, col + 1, knights);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (row - 2 >= 0 && col - 1 >= 0 && board[row - 2][col - 1]) {
            return false;
        }
        if (row - 2 >= 0 && col + 1 < board.length && board[row - 2][col + 1]) {
            return false;
        }
        if (row - 1 >= 0 && col - 2 >= 0 && board[row - 1][col - 2]) {
            return false;
        }
        if (row - 1 >= 0 && col + 2 < board.length && board[row - 1][col + 2]) {
            return false;
        }
        return true;
    }

    // static boolean isValid(boolean[][] board, int row, int col){
    // if(row >= 0 && col >= 0 && row < board.length && col < board.length){
    // return true;
    // }
    // return false;
    // }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print(cell ? "K" : "X");
            }
            System.out.println();
        }
        System.out.println();
    }
}
