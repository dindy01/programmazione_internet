package algoritmi;

public class binary {

    public static void main(String[] args) {
        int[] b = {7, 2, 5, 4, 1, 6, 0, 3};

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int middle = a.length / 2;
        int x = 8;
        
        if(inOrder(a)) {
            if (x > a[middle]) {
                for (int i = middle; i < a.length; i++) {
                    if (a[i] == x)
                        System.out.println(i);
                }
            } else {
                for (int i = 0; i <= middle; i++) {
                    if (a[i] == x)
                        System.out.println(i);
                }
            }
        }
    }
    public static boolean inOrder(int[] a) {
        boolean order = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                order = true;
            }
        }
        return order;
    }
}
