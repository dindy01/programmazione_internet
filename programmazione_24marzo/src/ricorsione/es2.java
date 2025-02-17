package ricorsione;

public class es2 {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(f(n));
        
    }
    
    public static int f(int n) {
        if(n == 0 || n == 1) {
            return n;
        } else {
            return 2 * f(n - 2) + 1;
        }
    }
}
