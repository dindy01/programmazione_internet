package algoritmi;

public class linear {

    public static void main(String[] args) {
        int[] a = {7, 2, 5, 4, 1, 6, 0, 3};
        int x = 4;
        
        for (int i = 0; i < a.length; i++) {
            if(a[i] == x) {
                System.out.println(i);
            }
        }

    }

}
