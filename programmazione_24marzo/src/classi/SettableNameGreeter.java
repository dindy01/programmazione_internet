package classi;

public class SettableNameGreeter {
    
    private String name; //Nome da salutare
    
    public SettableNameGreeter() {
        name = "World"; //Costruttore per nome di Default
    }
    
    public SettableNameGreeter(String aname) {
        name = aname;
    }
    
    public String sayHello() {
        String message = "Hello, " + name + "!";
        return message;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public String getName() {
        return name;
    }
}
