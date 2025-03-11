package eccezioni;

public class Consumi {

    public static void main(String[] args) {
        java.util.Scanner tastiera = new java.util.Scanner(System.in);
        int kilometri, litri, distanza;
        
        try {
            System.out.println("Inserire i kilometri percorsi: ");
            kilometri = tastiera.nextInt();
            System.out.println("Inserire i litri di benzina consumati: ");
            litri = tastiera.nextInt();
            
            distanza = kilometri / litri;
            
            System.out.println("la tua auto fa " + distanza + " kilometri al litro");
            
        } catch (Exception e) {
            System.out.println("Forse hai un problema: " + e.getMessage());
            System.out.println("Possibile che la tua auto non consumi?");
        }
        
        System.out.println("Fine programma");

    }

}
