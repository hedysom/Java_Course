import java.util.Scanner;

public class MagicSquare {
    private final int[][] square;
    private final int n;

    public MagicSquare(int n) {
        this.n = n;
        square = new int[n][n];
    }

    private boolean find(int x) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (square[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isFull() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (square[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void add(int x) {

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(square[i][j] == 0) {
                    square[i][j] = x;
                    return;
                }
            }
        }

    }

    public boolean isMagic() {
        int magicNumber = 0;
        boolean isMagic = true;
        //calculate magicNumber
        for(int i=0; i<n ; i++)
            magicNumber+=square[1][i];

        //first diagonal
        int diag = 0;
        for(int i=0; i<n ; i++)
            diag += square[i][i];

        if(diag != magicNumber)
            return false;

        //second diagonal
        diag = 0;
        for(int i=0; i<n; i++)
            diag += square[i][n-1-i];

        if (diag != magicNumber)
            return false;

        //rows
        for(int i=0; i<n; i++){
            int row=0;
            for(int j=0; j<n; j++) {
                row += square[i][j];
            }
            if (row!=magicNumber)
                return false;
        }
        //columns
        for(int i=0; i<n; i++) {
            int column = 0;
            for (int j = 0; j < n; j++) {
                column += square[j][i];
            }
            if (column != magicNumber)
                return false;
        }

        return isMagic;
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                toString.append(square[i][j]).append(" ");
            }
            toString.append("\n");
        }
        return toString.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci n --> ");
        int n = input.nextInt();
        MagicSquare square = new MagicSquare(n);

        while (!square.isFull()) {
            int x;
            do {
                System.out.print("Inserisci un numero --> ");
                x = input.nextInt();

                if (x < 1 || x > n * n) {
                    System.out.println("Devi inserire numeri compresi tra 1 e n^2!");
                } else {
                    if (square.find(x)) {
                        System.out.println("Questo numero lo avevi già inserito!");
                    }
                }
            } while (square.find(x) || x < 1 || x > n * n);
            square.add(x);
            System.out.println(square);
        }

        boolean magic = square.isMagic();

        if (magic)
            System.out.println("È un quadrato magico!");
        else
            System.out.println("Non è un quadrato magico!");
    }
}