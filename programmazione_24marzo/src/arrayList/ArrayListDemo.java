package arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> listaDelleCoseDaFare = new ArrayList<String>();
        
        System.out.println("Inserici gli elementi per " + 
                            " la lista quando richiesto.");
        boolean fatto = false;
        Scanner tastiera = new Scanner(System.in);
        
        while(!fatto) {
            System.out.println("Inserisci un elemento:");
            String elemento = tastiera.nextLine();
            listaDelleCoseDaFare.add(elemento);
            System.out.print("Altri elementi per la lista? ");
            String risposta = tastiera.nextLine();
            
            if(!risposta.equalsIgnoreCase("si")) {
                fatto = true;
            }
        }
        
        System.out.println("La lista contiene:");
        int dimensioneLista = listaDelleCoseDaFare.size();
        
        for(int posizione = 0; posizione < dimensioneLista; posizione++) {
            System.out.println(listaDelleCoseDaFare.get(posizione));
        }
    }

}
