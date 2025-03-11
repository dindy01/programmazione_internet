package Insiemi;

public class TestRange {

    public static void main(String[] args) {
        try{
            Range rangeVuoto = new Range();
            rangeVuoto.getLower();
            rangeVuoto.setUpper(9);
            rangeVuoto.contains(5);
            rangeVuoto.size();

            Range rangeSingolo = new Range(1);
            rangeSingolo.getLower();
            
            Range range = new Range(1, 11);
            range.setLower(20);
            
            Range rangeErrore = new Range(11, 1);
            System.out.println("range: " + range);
            
        } catch(UnsupportedOperationException e) {
            System.out.println("Errore. " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            System.out.println("Programma terminato");
            
        }
    }

}
