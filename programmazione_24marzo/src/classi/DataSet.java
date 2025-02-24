package classi;
/**
 * Calcola informazioni relative a un insieme di dati
 */
public class DataSet {
    /**
     * Costriuisce un insieme di dati vuoto
     */
    public DataSet()  {
        sum = 0;
        count = 0;
        maximum = 0;
    }
    /** aggiunge un valore all'insieme di dati
     * @param x un valore
     */
    public void add(double x) {
        sum = sum + x;
        if (count == 0 || maximum < x) 
            maximum = x;
        count++;
    }
    /**
     * Restituisce la media dei valori inseriti
     * @return la media, o 0 se non ci sono dati
     */
    public double getAverage() {
        if (count == 0)  
            return 0;
        else 
            return sum / count;
    }
    /**Restituisce il valore massimo tra i valori inseriti
     * @return il massimo, o 0 sen non ci sono dati
     * 
     */
    public double getMaximum() {
        return maximum;
    }
    
    private double sum;
    private double maximum;
    private int count;
}

