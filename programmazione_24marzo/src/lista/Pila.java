package lista;

public class Pila {
    private NodoLista testa;
    
    public Pila() {
        testa = null;
    }
    
    /*
     * QUesto metodo sostituisce aggiungiNodoInTesta
     */
    public void push(String nuoviDati) {
        testa = new NodoLista(nuoviDati, testa);
    }
    
    /*
     * Questo sostiutuice eliminaNodoDiTesta
     * e restituisce la stringa in cima alla pila
     */
    public String pop() {
        String dati = "";
        
        if(testa!= null) {
            dati = testa.getDati();
            testa = testa.getCollegamento();
        }
        return dati;
    }
 
    public boolean vuota() {
        return (testa == null);
    }
}
    
    