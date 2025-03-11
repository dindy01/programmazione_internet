package eccezioni;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;
public class Consumi {

    public static void main(String[] args) {
        java.util.Scanner tastiera = new java.util.Scanner(System.in);
        int kilometri = 0, litri, distanza;
        
        while(true) {
        try {
            System.out.println("Inserire i kilometri percorsi: ");
            kilometri = tastiera.nextInt();
            break;
            
        } catch (InputMismatchException e) {
            System.out.println("Devi inserire un numero intero: " + e.getMessage());
            tastiera.next();
        } catch (NoSuchElementException e) {
            System.out.println("Non è un numero." + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Scanner chiuso inaspettatamente");
            return;
        }
        }
        
        while(true) {
        try {
            System.out.println("Inserire i litri di benzina consumati: ");
            litri = tastiera.nextInt();
            
            distanza = kilometri / litri;
            System.out.println("la tua auto fa " + distanza + " kilometri al litro");
            break;
            
        }   catch (ArithmeticException e) {
            System.out.println("Divisione per zero non possibile");
        } catch (InputMismatchException e) {
            System.out.println("Devi inserire un numero intero: " + e.getMessage());
            tastiera.next();
        } catch (NoSuchElementException e) {
            System.out.println("Non è un numero." + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Scanner chiuso inaspettatamente");
            return;
        } 
        }
        
        tastiera.close();
        System.out.println("Fine programma");

    }

}
