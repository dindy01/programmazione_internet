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
                System.out.println("Oggi è Lunedi"); break;
            case MARTEDI:
                System.out.println("Oggi è Martedi"); break;
            case MERCOLEDI:
                System.out.println("Oggi è Mercoledì"); break;
            case GIOVEDI:
                System.out.println("Oggi è Giovedì"); break;
            case VEENERDI:
                System.out.println("Oggi è Venerdì"); break;
            case SABATO:
                System.out.println("Oggi è Sabato"); break;
            case DOMENTICA:
                System.out.println("Oggi è Domenica"); break;
        }
    }
}
