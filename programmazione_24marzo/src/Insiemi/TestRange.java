package Insiemi;

public class TestRange {

    public static void main(String[] args) {
        Range rangeVuoto = new Range();
        try{
            rangeVuoto.getLower();
        } catch(UnsupportedOperationException e) {
            System.out.println("Errore. " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
        
        try {
            rangeVuoto.setUpper(9);
        } catch(UnsupportedOperationException e) {
            System.out.println("Errore. " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
        try {
            rangeVuoto.contains(5);
        } catch(UnsupportedOperationException e) {
            System.out.println("Errore. " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
        try {
            rangeVuoto.size();
        } catch(UnsupportedOperationException e) {
            System.out.println("Errore. " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
            Range rangeSingolo = new Range(1);
         try {
            rangeSingolo.getLower();
         } catch(UnsupportedOperationException e) {
             System.out.println("Errore. " + e.getMessage());
         } catch(Exception e) {
             System.out.println("Errore: " + e.getMessage());
         }
            Range range = new Range(1, 11);
          try {
            range.setLower(20);
          } catch(UnsupportedOperationException e) {
              System.out.println("Errore. " + e.getMessage());
          } catch(Exception e) {
              System.out.println("Errore: " + e.getMessage());
          }
          try {
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
