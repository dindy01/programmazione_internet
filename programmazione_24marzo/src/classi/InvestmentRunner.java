package classi;
/**
02:    Questo programma calcola di quanto aumenta un investimento
03:    in un dato numero di anni.
04: */

public class InvestmentRunner {

    public static void main(String[] args) {
        final double INITIAL_BALANCE = 10000;
        final double RATE = 5;
        final int YEARS = 20;
        Investment invest = new Investment(INITIAL_BALANCE, RATE);
        invest.waitYears(YEARS);
        double balance = invest.getBalance();
        System.out.printf("The balance after %d years is %.2f\n", YEARS,balance);
    }

}
