package classi;
/*
 * La classe crea l'oggetto Carta che è composto da un seme e il valore
 */
public class Carta {
    /*
     * Fa riferimento alla classe Enum Seme che può assumere valori definiti arbitrariamente
     */
    private Seme s;     
    /*
     * Il valore che la carta può avere
     */
    private int valore;
    
    /*
     * Il costruttore della classe per creare l'oggetto carta prende in input Il seme e il valore 
     */
    public Carta(Seme s, int valore) {
        this.s = s;
        this.valore = valore;
    }
    
    public Seme getSeme() {
        return s;
    }
    
    public int getValore() {
        return valore;
    }
    
    public String toString() {
        return " [" + this.valore + " di " + this.s + "] ";
    }
}
