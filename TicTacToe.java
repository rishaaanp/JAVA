import java.util.Scanner;
public class TicTacToe {
private String board[][];
public TicTacToe() {
board = new String[3][3];
}
public void initializeBoard() {
int i, j;
for (i = 0; i < 3; i++) {
for (j = 0; j < 3; j++) {
board[i][j] = "_";
}
}
}
public boolean makeMove(int r, int c, int player) throws IllegalArgumentException {
boolean move = false;
if (r >= 3 || c >= 3 || r < 0 || c < 0) {
throw new IllegalArgumentException("Invalid move row or column provided "
+ "is beyond limit");
}
if (board[r][c] != "_") {
throw new IllegalArgumentException("Invalid move,space already occupied");
}
if (player == 1 && board[r][c] == "_") {
board[r][c] = "X";
move = true;
}
if (player == 2 && board[r][c] == "_") {
    board[r][c] = "O";
    move = true;
    }
    return move;
    }
    public void displayBoard() {
    int i, j;
    for (i = 0; i < 3; i++) {
    for (j = 0; j < 3; j++) {
    System.out.print(board[i][j] + " ");
    }
    System.out.println();
    }
    }
    public boolean checkWin(int r, int c, int player) {
    String val1 = "";
    String val2 = "";
    String val3 = "";
    String val4 = "";
    int i, j;
    boolean win = false;
    for (i = 0; i < 3; i++) {
    val1 += board[i][c];
    }
    for (j = 0; j < 3; j++) {
    val2 += board[r][j];
    }
    for (i = 0; i < 3; i++) {
    val3 += board[i][i];
    }
    for (i = 0; i < 3; i++) {
    for (j = 0; j < 3; j++) {
    if (i + j == 2) {
    val4 += board[i][j];
    }
    }
    }
    if (val1.equals("XXX") || val2.equals("XXX") || val3.equals("XXX")
    || val4.equals("XXX")) {
        System.out.println("Player 1 wins");
        win = true;
        }
        if (val1.equals("OOO") || val2.equals("OOO") || val3.equals("OOO")
        || val4.equals("OOO")) {
        System.out.println("Player 2 wins");
        win = true;
        }
        return win;
        }
        public boolean gameOver() {
        return true;
        }
        public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        TicTacToe game1 = new TicTacToe();
        game1.initializeBoard();
        System.out.println("Initial condition");
        game1.displayBoard();
        boolean gameStatus = false;
        System.out.print("Start game?(y/n):");
        String choice = obj.next();
        int player = 1;
        int count = 1;
        while (choice.equals("y") && gameStatus == false && count <= 9) {
        System.out.print("Enter the row:");
        int row = obj.nextInt() - 1;
        System.out.print("Enter the column:");
        int column = obj.nextInt() - 1;
        boolean move = false;
        try {
        move = game1.makeMove(row, column, player);
        } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        }
        if (move == false) {
        System.out.print("Enter the row:");
        row = obj.nextInt() - 1;
        System.out.print("Enter the column:");
column = obj.nextInt() - 1;
try {
game1.makeMove(row, column, player);
} catch (IllegalArgumentException e) {
System.out.println(e.getMessage());
}
}
game1.displayBoard();
boolean isWin = game1.checkWin(row, column, player);
if (isWin == true) {
gameStatus = game1.gameOver();
}
if (player == 1) {
player = 2;
} else {
player = 1;
}
count++;
}
}
}