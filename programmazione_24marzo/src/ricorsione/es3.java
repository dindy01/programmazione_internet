package ricorsione;

public class es3 {

    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 4, 1, 6, 8, 3};
        int i = arr.length - 1;
        int min = arr[i];
        System.out.println(minVal(arr, i, min));
    }
    
    public static int minVal(int[] x, int i, int min) {
        if (i <= 0) {
            return Math.min(min, x[0]); //restituisce il min finale che viene poi stampato
        } else {
            if(x[i] < min) {
                min = x[i];
                System.out.println("i: " + i);
            }
            System.out.println("min: " + min);
            return minVal(x, i - 1, min);
        }
    }

}
