package lista;

public class NodoListaDoppia {
    public String dati;
    public int dati_int;
    public NodoListaDoppia precedente;
    public NodoListaDoppia successivo;
    
    public NodoListaDoppia(String nuoviDati, NodoListaDoppia nodoPrecedente,
                                                NodoListaDoppia nodoSuccessivo) {
        dati = nuoviDati;
        successivo = nodoSuccessivo;
        precedente = nodoPrecedente;
    }
    
    public NodoListaDoppia(int nuoviDati, NodoListaDoppia nodoPrecedente,
            NodoListaDoppia nodoSuccessivo) {
        dati_int = nuoviDati;
        successivo = nodoSuccessivo;
        precedente = nodoPrecedente;
    }
    
    public String getDati() {
        return dati;
    }
    
    public int getDati_int() {
        return dati_int;
    }
    
    public NodoListaDoppia getPrecedente() {
        return precedente;
    }
    
    public NodoListaDoppia getSuccessivo() {
        return successivo;
    }
}
