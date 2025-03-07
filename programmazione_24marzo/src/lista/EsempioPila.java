package lista;

public class EsempioPila {
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.push("Alessandro");
        pila.push("Federico");
        pila.push("Marta");
        
        while (!pila.vuota()) {
            String s = pila.pop();
            System.out.println(s);
        }
    }
}
