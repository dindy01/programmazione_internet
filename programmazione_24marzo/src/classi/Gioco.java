package classi;

public class Gioco {
    private Mazzo mazzo;
    private int puntiGiocatore1;
    private int puntiGiocatore2;

    public Gioco() {
        /*
         * Crea il mazzo e mischia il mazzo
         */
        this.mazzo = new Mazzo();
        this.mazzo.mischia();
        this.puntiGiocatore1 = 0;
        this.puntiGiocatore2 = 0;
    }

    public void giocaPartita() {
        System.out.println("Inizio della partita!");
        /*
         * i turni sono gestiti dal for
         */
        for (int turno = 1; turno <= 20; turno++) {
            System.out.println("Turno " + turno);
            /*
             * Comincia il turno e si pescno le carte per i due giocatori
             */
            Carta cartaGiocatore1 = mazzo.pesca();
            Carta cartaGiocatore2 = mazzo.pesca();
            //Le carte stampate vengono stampate
            System.out.println("Giocatore 1 pesca: " + cartaGiocatore1);
            System.out.println("Giocatore 2 pesca: " + cartaGiocatore2);
            //Viene confrontate le carte con il metodo
            int risultato = confrontaCarte(cartaGiocatore1, cartaGiocatore2);
            if (risultato > 0) {
                puntiGiocatore1++;
                System.out.println("Giocatore 1 vince il turno!\n");
            } else if (risultato < 0) {
                puntiGiocatore2++;
                System.out.println("Giocatore 2 vince il turno!\n");
            } else {
                System.out.println("Turno pareggiato!\n");
            }
        }
        /*
         * Determina il vincitore
         */
        System.out.println("Partita terminata!");
        if (puntiGiocatore1 > puntiGiocatore2) {
            System.out.println("Giocatore 1 vince la partita con " + puntiGiocatore1 + " punti!");
        } else if (puntiGiocatore1 < puntiGiocatore2) {
            System.out.println("Giocatore 2 vince la partita con " + puntiGiocatore2 + " punti!");
        } else {
            System.out.println("La partita è finita in parità con " + puntiGiocatore1 + " punti ciascuno!");
        }
    }

    private int confrontaCarte(Carta c1, Carta c2) {
        if (c1.getValore() > c2.getValore()) {
            return 1;
        } else if (c1.getValore() < c2.getValore()) {
            return -1;
        } else {
            return Integer.compare(ordinalSeme(c1.getSeme()), ordinalSeme(c2.getSeme()));
        }
    }

    private int ordinalSeme(Seme s) {
        switch (s) {
            case DENARI: return 4;
            case COPPE: return 3;
            case BASTONI: return 2;
            case SPADE: return 1;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Gioco gioco = new Gioco();
        gioco.giocaPartita();
    }
}
