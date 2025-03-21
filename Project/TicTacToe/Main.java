import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);
        while (!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + ", enter your move (row[1-3] column[1-3]): ");
            int row = sc.nextInt() - 1;
            int col = sc.nextInt() - 1;
            if (board[row][col] == ' ') {
                // place the element
                board[row][col] = player;
                gameOver = (haveWon(board, player));
                if (gameOver) {
                    printBoard(board);
                    System.out.println("Player " + player + " wins!");
                    break;
                } else {
                    if (player == 'X') {
                        player = 'O';
                    } else {
                        player = 'X';
                    }
                }
            } else {
                System.out.println("Invalid move, try again");
                continue;
            }
        }
        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        System.out.println("  1 2 3");
        for (int row = 0; row < 3; row++) {
            System.out.print((row + 1) + " ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col]);
                if (col < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (row < 2) {
                System.out.println("  -----");
            }
        }
    }

    public static boolean haveWon(char[][] board, char player) {
        // check the rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        // check the columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        // check the diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        // check the other diagonal
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}
