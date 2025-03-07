package arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList();
        
        boolean fatto = false;
        Scanner tastiera = new Scanner(System.in);
        
        while(!fatto) {
            int numero = tastiera.nextInt();
            if(numero < 0 || numero  > 100) {
                fatto = true;
            } else {
                /*
                 * Se non inserisco la condizione nell'else anche il 
                 * numero < 0 o > 100 viene inserito nell'arrayList
                 */
                a.add(numero);
            }
        }
        ArrayList<Integer> b = new ArrayList();
        for(int i = 0; i < a.size(); i++) {
            for(int j = i + 1; j < a.size(); j++) {
                if(a.get(i) == a.get(j)) {
                    a.remove(j);
                }
            }
            b = a;
        }
        System.out.println("Inserisci numeri: ");
        System.out.println(b);
    }
}
