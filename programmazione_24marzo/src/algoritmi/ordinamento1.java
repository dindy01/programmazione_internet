package algoritmi;

public class ordinamento1{
    
    public static void main(String[] args) {
        
        int a[] = {7, 2, 5, 4, 1, 6, 0, 3};
        int temp = 0;
        
        
        for (int i = 0; i < a.length; i++) {
            
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;
            System.out.print(i + " ");
        }
    }
}