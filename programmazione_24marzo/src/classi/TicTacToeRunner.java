package classi;
import java.util.Scanner;
/**
 * Questo programma esegue la classe TicTacToe
 * chiedendo all'utente di e�selezionare posizione sulla
 * scacchiera e visualzizzando il risultato.
 */
public class TicTacToeRunner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String player = "x";
        TIcTacToe game = new TIcTacToe();
        boolean done = false;
        while (!done) {
            System.out.println(game.toString());
            System.out.print("Row for " + player + " (- 1 to exit): ");
            int row = in.nextInt();
            if(row < 0)
                done = true;
            else {
                System.out.print("Column for " + player + ": ");
                int column = in.nextInt();
                game.set(row, column, player);
                if (player.equals("x"))
                    player = "o";
                else
                    player = "x";
            }
        }
    }

}
