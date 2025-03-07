package lista;

public class ListaDoppia {
    private NodoListaDoppia testa;
    
    public void aggiungiNodoInTesta(String nuoviDati) {
        NodoListaDoppia nuovoNodo = new NodoListaDoppia(nuoviDati, null, testa);
        if (testa != null) {
            testa.precedente = nuovoNodo;
        }
        testa = nuovoNodo;
    }
    
    public void aggiungiNodoInTesta(int nuoviDati) {
        NodoListaDoppia nuovoNodo = new NodoListaDoppia(nuoviDati, null, testa);
        if (testa != null) {
            testa.precedente = nuovoNodo;
        }
        testa = nuovoNodo;
    }
    
    public void mostraDoppiaLista() {
        NodoListaDoppia posizione = testa;
        while(posizione != null) {
            System.out.println(posizione.getDati());
            posizione = posizione.getSuccessivo();
        }
    }
    
    public int lunghezza() {
        int conteggio = 0;
        NodoListaDoppia posizione = testa;
        while(posizione != null) {
            conteggio++;
            posizione = posizione.getSuccessivo();
        } return conteggio;
    }
    
    public void eliminaNodoInTesta() {
        if (testa != null) {
            testa = testa.getSuccessivo();
        }
        System.out.println("La lista è vuota");
    }
    
    public NodoListaDoppia trova(String elementoDaTrovare) {
        NodoListaDoppia posizione = testa;
        while(posizione != null) {
            String datiAllaPosizione = posizione.getDati();
            if(datiAllaPosizione.equals(elementoDaTrovare))
                return posizione;
            posizione = posizione.getSuccessivo();
        }
        return null;
    }
    
    public boolean nellaLista(String elemento) {
        return trova(elemento) != null;
    }
    
    public boolean isPalindrome(ListaDoppia lista) {
        /*
         * Trovare lunghezza lista per formare un array identico
         * Invertire le variabile all'interno dell'array 
         * ripopolare la lista inversa
         * confrontare la vecchia lista con quella inversa
         * stabilire se è palindroma o meno
         */
        NodoListaDoppia posizione = testa;
        boolean isPalindrome = false;
        int length = lista.lunghezza();
        int[] a = new int[length];
        for(int i = 0; i < length; i++) {
            a[i] = posizione.getDati_int();
            posizione = posizione.getSuccessivo();
        }
        /*
         * Debug 
         * for(int e : a) {
         * System.out.print(e + " ");
         *}
        */
        int right = 0;
        int left = a.length - 1;
        
        while (right < left) {
            if (a[right] == a[left]) {
                isPalindrome = true;
            } else {
                return false;
            }
            right++;
            left--;
        }
        return isPalindrome;
    }
}
