package classi;
/**
 * Una scacchiera 3x3 per il gioco tic tac toe
 */
public class TIcTacToe {
    /**Costruisce una sccacchiera vuota
     * 
     */
    public TIcTacToe() {
        board = new String[ROWS][COLUMNS];
        //riempi di spazi
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
                board[i][j] = " ";
    }
    /**
    19:       Imposta un settore della scacchiera.
      Il settore deve essere libero.
    20:       @param i l'indice di riga 
   21:       @param j l'indice di colonna
    22:       @param player il giocatore ("x" o "o")
    23:    */
    public void set(int i, int j, String player) {
        if (board[i][j].equals(" "))
            board[i][j] = player;
    }
    
   /**Crea una rappresentazione della scacchiera in una stringa,
    * ad esemio
    *  |x  o|
 33:   |  x |
 3     |   o|
      @return la rappresentazione della stringa
    */
    public String toString() {
        String r = "";
        for (int i = 0; i < ROWS; i++) {
            r = r + "|";
            for (int j = 0; j < COLUMNS; j++) {
                r = r + board[i][j];
            }
            r = r + "|\n";
        }
        return r;
    }
    
    private String[][] board;
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;
}
