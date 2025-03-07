package lista;

public class ListaConcatenataDiStringhe {
    private NodoLista testa;
    
    public ListaConcatenataDiStringhe() {
        testa = null;
    }
    
    /**
     * Mostra i dati della lista
     */
    public void mostraLista() {
        NodoLista posizione = testa;
        while(posizione != null) {
            System.out.println(posizione.getDati());
            posizione = posizione.getCollegamento();
        }
    }
    /*
     * Come fa posizione ad essere aggiornato al collegaemtno dell'elemento dopo?
     */
    
    /*
     * Restituisce il numero di nodi che compongono la lista
     */
    public int lunghezza() {
        int conteggio = 0;
        NodoLista posizione = testa;
        while(posizione != null) {
            conteggio++;
            posizione = posizione.getCollegamento();
        }
        return conteggio;
    }
    /*
     * Aggiunge all'inizio della lista
     * un nodo contenente datiDaAggiungere
     */
    public void aggiungiNodoInTesta(String datiDaAggiungere) {
        testa = new NodoLista(datiDaAggiungere, testa);
    }
    
    /*
     * Elimina il primo nodo della lista
     */
    public void eliminaNodoDiTesta() {
        if (testa != null)
            testa = testa.getCollegamento();
        else {
            System.out.println("Si sta eliminando da una lista vuota.");
            System.exit(0);
        }
    }
    /*
     * Verifica se elemento è nella lista
     */
    public boolean nellaLista(String elemento) {
        return trova(elemento) != null;
    }
    
    /*
     * Restituisce un riferimento al primo nodo che contiene elemento.
     * Se elemento non è nella lista, restituisce null
     */
    private NodoLista trova(String elemento) {
        boolean trovato = false;
        NodoLista posizione = testa;
        while((posizione != null) && !trovato) {
            String datiAllaPosizione = posizione.getDati();
            if(datiAllaPosizione.equals(elemento))
                trovato = true;
            else
                posizione = posizione.getCollegamento();
        }
        return posizione;
    }
    
    private NodoLista trova(NodoLista pos, String elem) {
        NodoLista posizione = pos;
        if((posizione != null)) {
            String datiAllaPosizione = posizione.getDati();
            if(datiAllaPosizione.equals(elem)) {
                return posizione;
            } else {
                return trova(posizione.getCollegamento(), elem);
            }
        }
        return null;
    }
}
