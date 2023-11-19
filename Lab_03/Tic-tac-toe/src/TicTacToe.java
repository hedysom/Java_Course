import java.util.Scanner;

public class TicTacToe {

    private final String[][] board;
    static int ROWS = 3;
    static int COLUMNS = 3;
    static String player1 = "x";
    static String player2 = "o";

    public TicTacToe() {
        board = new String[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
                board[i][j] = " ";
    }

    public String toString() {
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < ROWS; i++) {
            r.append("|");
            for (int j = 0; j < COLUMNS; j++)
                r.append(board[i][j]);
            r.append("|\n");
        }
        return r.toString();
    }

    public void set(int i, int j, String player) {
        if (board[i][j].equals(" "))
            board[i][j] = player;
    }

    public String getWinner() {
        //ROWS CHECK
            for(int i=0; i<ROWS; i++) {
                //player 1
                if (player1.equals(board[i][0]) &&
                        board[i][0].equals(board[i][1]) &&
                        board[i][1].equals(board[i][2]))
                    return player1;
                //player 2
                if (player2.equals(board[i][0]) &&
                        board[i][0].equals(board[i][1]) &&
                        board[i][1].equals(board[i][2]))
                    return player2;
            }
         //COLUMN CHECK
        for(int i=0; i<COLUMNS; i++) {
            //player 1
            if (player1.equals(board[0][i]) &&
                    board[0][i].equals(board[1][i]) &&
                    board[1][i].equals(board[2][i]))
                return player1;
            //player 2
            if (player2.equals(board[0][i]) &&
                    board[0][i].equals(board[1][i]) &&
                    board[1][i].equals(board[2][i]))
                return player2;
        }
        //DIAGONALS CHECK
        //player 1
        //first diagonal
        if (player1.equals(board[0][0]) &&
                board[0][0].equals(board[1][1]) &&
                board[1][1].equals(board[2][2]))
            return player1;
        //second diagonal
        if (player1.equals(board[2][0]) &&
                board[2][0].equals(board[1][1]) &&
                board[1][1].equals(board[0][2]))
            return player1;
        //player 2
        //first diagonal
        if (player2.equals(board[0][0]) &&
                board[0][0].equals(board[1][1]) &&
                board[1][1].equals(board[2][2]))
            return player2;
        //second diagonal
        if (player2.equals(board[2][0]) &&
                board[2][0].equals(board[1][1]) &&
                board[1][1].equals(board[0][2]))
            return player2;
        // NO WINNER
        return ("Nessun vincitore");
    }

    public static void main(String[] args) {
        String player = player1;
        TicTacToe game = new TicTacToe();
        Scanner in = new Scanner(System.in);
        int row, column;
        System.out.println(game);

        do {

            if (game.getWinner().equals(player1) || game.getWinner().equals(player2)) {
                System.out.println("Partita finita");
                System.exit(0);
            }

            System.out.println("Inserisci riga per " + player + " (-1 per uscire):");
            row = in.nextInt();

            if (row == -1) {
                System.out.println("Partita finita");
                System.exit(0);
            }

            System.out.println("Inserisci colonna per " + player + ":");
            column = in.nextInt();

            if (row >= ROWS || column >= COLUMNS) {
                System.out.println("Combinazione non valida");
            } else {
                game.set(row , column, player);

                System.out.println(game);

                System.out.println("Il vincitore è "+ game.getWinner());

                if(player.equals(player1))
                    player = player2;
                else
                    player = player1;
            }

        } while (row < ROWS && column < COLUMNS);
    }
}