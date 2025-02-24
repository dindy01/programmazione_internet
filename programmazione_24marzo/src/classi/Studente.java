package classi;

public class Studente {
    private String name;
    private String matricola;
    private int numeroEsami;
    private String[] elencoEsami;
    private Esame[] esamiPassati;
    
    public Studente(String name, String matricola, int esami) {
        this.name = name;
        this.matricola = matricola;
        numeroEsami = esami;
        elencoEsami = new String[numeroEsami];
        esamiPassati = new Esame[numeroEsami];
    }
    
    public void addEsami(String esame) {
        for (int i = 0; i < elencoEsami.length; i++) {
            if (elencoEsami[i] == null) {
                elencoEsami[i] = esame;
                return;
            }
        }
        System.out.println("Non puoi aggiungere più esami");
    }
    
    public void addEsamiPassati(Esame esame) {
        //controllo che l'esame sia all'interno della carriera
        for (int i = 0; i < elencoEsami.length; i++) {
            if (elencoEsami[i].equalsIgnoreCase(esame.getEsame()) ) {
                if (esame.getVoto() >= 18 && esamiPassati[i] == null) {
                            esamiPassati[i] = esame;
                            return;
                }
            }
        }
    System.out.println("Esame non trovato nella carriera o voto insufficiente");
    }
    
    public int esamiRimasti() {
        int count = 0;
        for (int i = 0; i < elencoEsami.length; i++) {
            /*
             * Verifica che ci sia un esame registrato e che l'esame non sia 
             * all'interno dell'array esamiPassati quindi ancora non è
             * passato
             */
            if (elencoEsami[i] != null && esamiPassati[i] == null) 
                count++;
        }
        return count;
    }
    
    /*
     * Controllo quali elementi nell'array esamiPaassat non sono null, ovvero
     * hanno un voto 
     */
    
    //Essendo tra le variabili di istaznza si può usare esamiPassati direttamente
    private int countVoti() {
        int count = 0;
        for (int i = 0; i < esamiPassati.length; i++) {
            if (esamiPassati[i] != null)
                count++;
        }
        return count;
    }
    
    
    public int mediaVoti() {
        int somma = 0;
        /*
         * chiama la funzione countVoti per sapere quanti voti servono
         */
        int count = countVoti();
        
        if (count == 0) /*Se count == 0 allora non facciamo la divisione*/
            return 0;
        
        for (int i = 0; i < esamiPassati.length; i++) {
            /*
             * controlla che l'eleemento non sia nullo
             * e aggiorna la somma dei voti
             */
            if(esamiPassati[i] != null) { 
                somma += esamiPassati[i].getVoto();
            }
        }
        return somma / count;
    }
    
    public void stampaEsamiPassati() {
        for (Esame e : esamiPassati) {
            if (e != null) {
                /*
                 * il metodo print() di System.out cerca sempre di rappresentare
                 * il valore e sotto forma di stringa. QUindi quando usiamo questo metodo
                 * JAva invoca il metodo toString, ma se abbiamo fatto l'override di questo
                 * metodo su un oggetto Java utilizzerà la versione personalizzata
                 */
                System.out.println(e + ", "); 
            }
        }
    }
    
    
    public Esame[] getEsamiPassati() {
        return esamiPassati;
    }
    
    public String toString() {
        return "nome studente: " + name + " matricola: " + matricola + " esami rimanenti: " + 
                                                                    esamiRimasti() + 
                                                                    " media voti: " + 
                                                                    mediaVoti();
    }
}
