package classi;

public class ElementoDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //questa verisone del for vuold dire
        /*
         * per ogni elemento e che appartiene ad Elemento.values()"
         */
        for ( Elemento e : Elemento.values()) {
            System.out.println(e.getSimbolo() + "\t|\t" + e.getNumeroAtomico() 
                                + "|\t" + e);
        }
    }

}
