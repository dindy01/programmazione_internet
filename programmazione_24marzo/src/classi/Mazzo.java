package classi;

public class Mazzo {
    private Carta[] carte;
    private int numCarte;
    
    /*
     * Costruttore per il mazzo
     */
    public Mazzo() {
        this.numCarte = 40;
        this.carte = new Carta[40];
    
    
    for(int i = 0; i < 10; i++) {
        this.carte[i] = new Carta(Seme.DENARI, i +1);
        this.carte[i+10] = new Carta(Seme.COPPE, i+1);
        this.carte[i + 20] = new Carta(Seme.BASTONI, i +1);
        this.carte[i + 30] = new Carta(Seme.SPADE, i+1);    
        }
    
    }
    
    public void mischia() {
        //TODO
    }
    
    public Carta pesca() {
        //TODO
        return null;
    }
    
    public String toString() {
        String s = "";
        for (int i = 0; i < numCarte; i++)
            s += this.carte[i] + " , ";
        
        return s;
    }
    
}
