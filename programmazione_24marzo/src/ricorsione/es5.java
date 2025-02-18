package ricorsione;

public class es5 {

    public static void main(String[] args) {
        int n = 5;
        int x = 0;
        System.out.println(f(n, x));
    }
    
    public static int f(int n, int x) {
        if (n == 0) {
            return x;
        } else {
            x += n * n;
            return f(n - 1, x);
        }
    }
}
