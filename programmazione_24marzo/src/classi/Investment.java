package classi;
/*
Una classe per controllare la crescita di un investimento 
che accumula interessi a un tasso annuale fisso.
04: */
public class Investment {
    /**
     * Costruisce un oggetto Investment con un saldo iniziale 
     * e un tasso di interesse.
     * @param aBalance il saldo iniziale
     * @param aRate il tasso d’interesse percentuale
     */
    public Investment(double aBalance, double aRate ) {
        balance = aBalance;
        rate = aRate;
        years = 0;
    }
    
    /**
     * Continua ad accumulare interessi finché il saldo
     * non raggiunge un valore desiderato.
     * @param targetBalance il saldo desiderato
     */
    public void waitForBalance(double targetBalance) {
        while (balance < targetBalance) {
            years++;
            double interest = balance * rate / 100;
            balance = balance + interest;
        }
    }
    /**
     * Continua ad accumulare interessi per un dato numero di anni.
     * @param n il numero di anni
     */
    public void waitYears(int n) {
        for (int i = 1; i <= n; i++) {
            double interest = balance * rate / 100;
            balance = balance + interest;
        }
        years = years + n;
    }
    
    /**
     * Restituisce il saldo attuale dell’investimento.
     * @return il saldo attuale
     */
    public double getBalance() {
        return balance;
    }
    /**
    59:       Restituisce il numero di anni per i quali l’investimento
    60:       ha accumulato interessi.
    61:       @return il numero di anni dall’inizio dell’investimento
    62:    */
    public int getYears() {
        return years;
    }
    
    private double balance;
    private double rate;
    private int years;
}
