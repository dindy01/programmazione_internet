package classi;
/*Un oggetto InitialsMaker usa il nome e
cognome di una persona per produrre le
iniziali in maiuscolo.
Es: Henry James o henry james = HJ*/
public class InitialsMaker {
    
    private String firstName;
    private String lastName;
    private String initials;
    
    public InitialsMaker(String firstName, String lastName) {
        initials = firstName.substring(0, 1) + lastName.substring(0,1);
        initials = initials.toUpperCase();
    }
    
    public String getInitials() {
        return initials;
    }
    
    public String toString() {
        return "InitialsMaker[initials= " + initials + "]";
    }
}
