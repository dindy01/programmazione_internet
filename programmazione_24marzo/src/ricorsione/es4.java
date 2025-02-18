package ricorsione;

public class es4 {
    
    public static void main(String[] args) {
        int[] a = {1, 12, 15, 14, 11, 16, 110, 11};
        int i = 0;
        System.out.println(maggioridi10(a, i));
    }
    
    public static boolean maggioridi10(int[] a, int i) {
        
        if (i == a.length) {
            return true;
            
        } else if (a[i] <= 10) {
            return false;
            
        } else {
            return maggioridi10(a, i + 1);
        }
    }
    
}