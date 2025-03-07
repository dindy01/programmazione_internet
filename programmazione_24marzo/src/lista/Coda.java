package lista;

public class Coda {
    private NodoLista coda;
    private NodoLista testa;
    
    public Coda() {
        testa = null;
        coda = null;
    }
    
    /*
     * AggiungiNodoInCoda
     * 
     */
    public void push(String nuoviDati) {
         NodoLista nuovoNodo = new NodoLista(nuoviDati);
         if (coda == null) {
             //Se la coda è vuota, testa e coda diventano lo 
             //stesso nodo
             testa = nuovoNodo;
             coda = nuovoNodo;
         } else {
             //Aggiungo n fondo
             //Collego il vecchio ultimo nodo al nuovo nodo
             coda.setCollegamento(nuovoNodo);
             //aggiorno la coda al nuovo nodo
             coda = nuovoNodo;
         }
    }
    /*
     * Elimina l'elemento in testa 
     * e restituisce la stringa in cima
     * alla coda
     */
    public String pop() {
        if (testa == null) {
            return "Coda vuota";
        } 
        //Ottengo il valore in testa e lo memorizzo per poi restituirlo
        String dati = testa.getDati(); 
        // Sposto la testa al nodo successivo
        testa = testa.getCollegamento();
        
        //Se la coda diventa vuota, aggiorno anche 'coda'
        if (testa == null) {
            coda = null;
        }
        return dati;
    }
    
    //Controlla se la coda è vuota
    public boolean isEmpty() {  
        return testa == null;
    }
    
    //Stampa gli elementi della coda
    public void stampaCoda() {
        System.out.println("Coda: ");
        NodoLista temp = testa;
        while (temp != null) {
            System.out.println(temp.getDati() + " -> ");
            temp = temp.getCollegamento();
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        Coda queue = new Coda();
        queue.push("A");
        queue.push("B");
        queue.push("C");
        queue.push("D");
        
        queue.stampaCoda(); // Output: A -> B -> C -> D -> null
        
        System.out.println("Elemento Eliminato: " + queue.pop());
        queue.stampaCoda(); //Output: B -> C -> D -> null
    }
}
