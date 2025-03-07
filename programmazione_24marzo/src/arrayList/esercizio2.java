package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class esercizio2 {
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
        boolean swap;
        for (int i = 0; i < a.size() - 1; i++) {
            swap = false;
            for (int j = 0; j < a.size() - i - 1; j++) {
                if(a.get(j) > a.get(j + 1)) {
                    int temp = a.get(j + 1);
                    a.set(j + 1,  a.get(j));
                    a.set(j, temp);
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        b = new ArrayList<>(a);
        System.out.println(b);
    }
    public void insertionSort(ArrayList<Integer> a) {
        for (int i = 1; i < a.size() - 1; i++) {
            int j = i;
            while( j > 0 && a.get(j - 1) > a.get(j)) {
                int temp = a.get(i)
            }
        }
    }
    
}
