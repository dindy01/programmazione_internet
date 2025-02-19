package ricorsione;

public class es9 {

    public static void main(String[] args) {
        
        int x = 0;
        int[] a = {7, 2, 5, 4, 1, 6, 0, 3};
        int i = a.length - 1;
        System.out.print(sommaQuadrati(a, x, i));
    }
    
    public static int sommaQuadrati(int[] a, int x, int i) {
        if (i == 0) {
            return x;
        } else {
            if (i % 2 != 0) {
                x += a[i] * a[i];
            }
        }
        return sommaQuadrati(a, x, i - 1);
    }

}
