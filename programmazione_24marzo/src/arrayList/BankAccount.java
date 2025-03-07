package arrayList;
/**
02: Un conto corrent ha un certo saldo che può essere modificato
03: da depositi e prelievi successivi
04: */
public class BankAccount {
    /**
    08: Costruisce un conto bancario con saldo uguale a zero.
    09: @param anAccountNumber il numero di questo conto bancario
    10: */
    public BankAccount(int anAccountNumber) {
        accountNumber = anAccountNumber;
        balance = 0;
    }
    /**
    18: Costruisce un conto bancario con un saldo iniziale.
    19: @param anAccountNumber il numero di questo conto bancario
    20: @param initialBalance il saldo iniziale
    21: */
    public BankAccount(int anAccountNumber, double intialBalance) {
        accountNumber = anAccountNumber;
        balance = intialBalance;
    }
    /**
    29: Restituisce il numero di conto del conto bancario.
    30: @return il numero di conto
    31: */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
    38: Versa denaro nel conto bancario.
    39: @param amount l’importo da versare
    40: */
    public void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
    }
    
    /**
    48: Preleva denaro dal conto bancario.
    49: @param amount l’importo da prelevare
    50: */
    public void withdraw(double amount) {
        double newBalance = balance - amount;
        balance = newBalance;
    }
    
    /**
    58: Ispeziona il valore del saldo attuale del conto bancario59: @return il saldo attuale
    60: */
    public double getBalance() {
        return balance;
    }
    
    private int accountNumber;
    private double balance;
}
