package classi;

public class BankAccount {
    
    private int number;
    private Persona persona;
    private double balance;
    
    public BankAccount (int accountNumber, Persona ownerName,
                                            double initialBalance) {
        number = accountNumber;
        persona = ownerName;
        balance = initialBalance;
    }
    
    public void deposit (double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        balance -= amount;
    }
    
    public int getNumber() {
        return number;
    }
    
    public String getOwner() {
        return persona.getName() + persona.getSurname();
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String toString() {
        return "BankAccoount[" + "number=  " + number 
                                + ", name = " + persona.getName()
                                + ", balance = " + balance + "]";
    }
}
