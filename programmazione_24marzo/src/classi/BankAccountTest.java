package classi;

public class BankAccountTest {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Badyy", "1");
        Persona persona2 = new Persona("BlueSockett", "2");
        BankAccount account1 = new BankAccount (1030256, persona1, 1000);
        BankAccount account2 = new BankAccount (1131257, persona2, 500);
        
        account1.deposit(100);
        account1.withdraw(300);
        
        System.out.println(account1.toString());
        
        System.out.println(account2.getBalance());
        System.out.println(account2.getOwner());
        
        Persona persona3 = new Persona("Fred", "3");
        Persona persona4 = new Persona("Mary", "4");
        BankAccount fred = new BankAccount(123, persona3, 1000);
        BankAccount mary = new BankAccount(345, persona4, 1000);
        
        TransferAgent agent = new TransferAgent(fred, mary);
        agent.transfer(500);
        
        System.out.println(fred);
        System.out.println(mary);
    }
}
