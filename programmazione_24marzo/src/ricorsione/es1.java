package ricorsione;

public class es1 {
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(f(n));
    }
    
    public static int f(int n) {
        if (n <= 1) {
            return 0;
        } else if (n > 1 && n % 2 != 0) {
            System.out.println(n);
            return f (n - 1) + 2;
        } else {
            System.out.println(n);
            return f (n / 2) - 1;
        }
    }
}