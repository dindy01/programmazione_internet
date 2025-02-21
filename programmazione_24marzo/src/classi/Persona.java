package classi;
/* Modificare la classe BankAccount in modo
che il possessore non sia solo una stringa
ma un oggetto Persona, caratterizzata (per
semplicità) da un nome e cognome
La classe Persona espone costruttore e
metodi getter*/
public class Persona {
    
    private String name;
    private String surname;
    
    public Persona(String aname, String asurname) {
        name = aname;
        surname = asurname;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSurname() {
        return surname;
    }
}
