package algoritmi;
import java.util.Scanner;
public class bubblesort {

    public static void main(String[] args) {
        
        int[] a = new int[8];
        Scanner tastiera = new Scanner(System.in);
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("Inserisci il " + (i + 1) + "°" + " elemento");
            a[i] = tastiera.nextInt();
        }
        tastiera.close();
        
        for (int i = 0; i < a.length - 1; i++) {
            boolean swapped = false;
            
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
        for (int e : a) {
            System.out.print(e + " ");
        }
    }

}
