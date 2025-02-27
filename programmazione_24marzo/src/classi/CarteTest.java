package classi;

public class CarteTest {

    public static void main(String[] args) {
        Mazzo m = new Mazzo();
        
        m.mischia();
        
        System.out.println(m);
        
        Carta c = m.pesca();
        
        System.out.println(c);
    }
}
