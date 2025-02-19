package ricorsione;

public class es7 {

    public static void main(String[] args) {
        int n = 24;
        System.out.print(prod(n));
    }
    
    public static int prod(int n) {
        return prodHelper(n, 1, 1);
    }
    
    
    
    public static int prodHelper(int limite, int numero, int fattoriale) {
        if (fattoriale * (numero + 1) >= limite) {
            return numero;
        } else {
            return prodHelper(limite, numero + 1, fattoriale * (numero + 1));
        }
    }
}
