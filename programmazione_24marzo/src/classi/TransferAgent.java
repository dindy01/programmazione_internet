package classi;

public class TransferAgent {
    
    private BankAccount from;
    private BankAccount to;
    
    public TransferAgent(BankAccount from, BankAccount to) {
        this.from = from;
        this.to = to;
    }
    
    public void transfer (double amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }
}
