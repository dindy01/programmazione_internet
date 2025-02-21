package classi;

public class SettableNameGreeterTest {

    public static void main(String[] args) {
        
        SettableNameGreeter myGreeter = new SettableNameGreeter("Pippo");
        System.out.println(myGreeter.sayHello());
        //Stampa "Hello, Pippo"
        myGreeter.setName("Pluto");
        System.out.println(myGreeter.sayHello());
        //Stampa "Hello, Pluto!"
    }

}
