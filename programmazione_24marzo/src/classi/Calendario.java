package classi;

public class Calendario {
    public enum Giorno {
        LUNEDI,
        MARTEDI,
        MERCOLEDI,
        GIOVEDI,
        VEENERDI,
        SABATO,
        DOMENTICA;
    }
    
    public static void main(String[] args) {
        Giorno giornoDellaSettimana = Giorno.GIOVEDI;
        
        switch(giornoDellaSettimana) {
            case LUNEDI:
                System.out.println("Oggi � Lunedi"); break;
            case MARTEDI:
                System.out.println("Oggi � Martedi"); break;
            case MERCOLEDI:
                System.out.println("Oggi � Mercoled�"); break;
            case GIOVEDI:
                System.out.println("Oggi � Gioved�"); break;
            case VEENERDI:
                System.out.println("Oggi � Venerd�"); break;
            case SABATO:
                System.out.println("Oggi � Sabato"); break;
            case DOMENTICA:
                System.out.println("Oggi � Domenica"); break;
        }
    }
}
