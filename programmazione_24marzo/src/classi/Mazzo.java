package classi;
import java.util.Random;
/*
 * La classe costruisce il mazzo di carte
 */
public class Mazzo {
    /*
     * Utilizziamo l'array per memorizzare tutte le carte in una struttura dati
     */
    private Carta[] carte;
    /*
     * Il numero di carte all'interno del mazzo
     */
    private int numCarte;
    
    /*
     * Costruttore per il mazzo
     */
    public Mazzo() {
        /*
         * ci sono 40 carte nel nostro mazzo
         */
        this.numCarte = 40;
        /*
         * costruisce l'array da 40 elementi
         */
        this.carte = new Carta[40];
    
    /*
     * il for inizializza le carte con Il seme e il valore grazie all'indice i
     */
    for(int i = 0; i < 10; i++) {
        /*
         * Quando i = 0 allora in carte[0] avremo un ASSO di DENARI i = 1 -> DUE di DENARI
         */
        this.carte[i] = new Carta(Seme.DENARI, i +1);
        /*
         * i = 0 avremo carte[0+10] quindi carte[10] = ASSO di COPPE
         */
        this.carte[i+10] = new Carta(Seme.COPPE, i+1);
        this.carte[i + 20] = new Carta(Seme.BASTONI, i +1);
        /*
         * carte[0+20] = ASSO di BASTONI
         */
        this.carte[i + 30] = new Carta(Seme.SPADE, i+1);    
        /*
         * 
         */
        }
    
    }
    
    public void mischia() {
        /*
         * ci vuole un random che prenda i valori da carte[] e li mischi per poi metterli in un certo ordine
         *  quindi ho indice i che scorre il mazzo e in carte[i] ci metto carte[j]
         */
        Random random1 = new Random();
        /*
         * Uso l'algoritmo Fisher Yates per mescolare le carte in modo random
         * e efficiente
         */
        for(int i = carte.length - 1; i > 0; i--){
           int j = random1.nextInt(i + 1);
           Carta temp = carte[j];
           carte[j] = carte[i];
           carte[i] = temp;
        }
    }
    
    public Carta pesca() {
        if (carte.length == 0) {
            throw new IllegalStateException("Mazzo terminato");
        }
        
        //Pesca la prima carta, spostando tutte le altre di una posizione
        Carta pescata = carte[0];
        
        // Sposta tutte le carte di una posizione a sinistra 
        for (int i = 1; i < carte.length; i++) {
            carte[i - 1] = carte[i];
        }
        
        //ultima poszione a null
        carte[carte.length - 1] = null;
        
        return pescata;
    }
    
    public String toString() {
        String s = "";
        for (int i = 0; i < numCarte; i++)
            s += this.carte[i] + " , ";
        
        return s;
    }
    
}
