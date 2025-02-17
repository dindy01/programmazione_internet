//Implementa Selection Sort
package algoritmi;

public class ordinamento1 {
    
    public static void main(String[] args) {
        
        int a[] = {7, 2, 5, 4, 6, 0, 3};
        int temp = 0; //variable temporanea per lo swap
        
        //primo ciclo for
        for (int i = 0; i < a.length; i++) {
            
            int min = i; //variabile per memorizzare il minimo elemento dell'array
            
            //secondo ciclo for per trovare il minimo
            for (int j = i + 1; j < a.length; j++) {
                //confronto per trovare il valore minimo
                if(a[min] > a[j]) {
                    //se trovo il valore minimo memorizzo la sua POSIZIONE nell'array
                    min = j;
                }
            }
            //swap
            temp = a[min]; //memorizzo il valore minimo all'interno di una variabile temporanea
            a[min] = a[i]; //assegno l'elemento i dell'array all'elemento dove si trovava prima il valore minimo
            a[i] = temp; //ora nella posizione i inserisco il valore minimo
            //alla fine dell'iterazione ilvalore di i viene incrementato e l'array comincia dal valore successivo
        }
    }
}