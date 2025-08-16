// Tic-Tac-Toe AI Game in Java using Minimax
// Step-by-step implementation

import java.util.*;

public class TicTacToe {
    static final char HUMAN = 'X';
    static final char AI = 'O';
    static final char EMPTY = ' ';
    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initializeBoard();
        printBoard();

        while (true) {
            // Human move
            System.out.println("Enter your move (row and column: 0, 1, 2): ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if (board[row][col] == EMPTY) {
                board[row][col] = HUMAN;
                printBoard();
                if (checkWinner(HUMAN)) {
                    System.out.println("You win!");
                    break;
                } else if (isBoardFull()) {
                    System.out.println("It's a draw!");
                    break;
                }

                // AI move
                int[] bestMove = findBestMove();
                board[bestMove[0]][bestMove[1]] = AI;
                System.out.println("AI played at position: " + bestMove[0] + ", " + bestMove[1]);
                printBoard();
                if (checkWinner(AI)) {
                    System.out.println("AI wins!");
                    break;
                } else if (isBoardFull()) {
                    System.out.println("It's a draw!");
                    break;
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        sc.close();
    }

    static void initializeBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = EMPTY;
    }

    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == EMPTY)
                    return false;
        return true;
    }

    static boolean checkWinner(char player) {
        // Rows, Columns, Diagonals
        for (int i = 0; i < 3; i++)
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player))
                return true;
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    static int[] findBestMove() {
        int bestScore = Integer.MIN_VALUE;
        int[] move = new int[2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    board[i][j] = AI;
                    int score = minimax(0, false);
                    board[i][j] = EMPTY;
                    if (score > bestScore) {
                        bestScore = score;
                        move[0] = i;
                        move[1] = j;
                    }
                }
            }
        }
        return move;
    }

    static int minimax(int depth, boolean isMaximizing) {
        if (checkWinner(AI)) return 1;
        if (checkWinner(HUMAN)) return -1;
        if (isBoardFull()) return 0;

        if (isMaximizing) {
            int bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == EMPTY) {
                        board[i][j] = AI;
                        bestScore = Math.max(bestScore, minimax(depth + 1, false));
                        board[i][j] = EMPTY;
                    }
                }
            }
            return bestScore;
        } else {
            int bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == EMPTY) {
                        board[i][j] = HUMAN;
                        bestScore = Math.min(bestScore, minimax(depth + 1, true));
                        board[i][j] = EMPTY;
                    }
                }
            }
            return bestScore;
        }
    }
}
