package classi;

import java.time.LocalDate;

public class StudenteUtilizer {

    public static void main(String[] args) {
        Studente studente1 = new Studente("alessandro", "01234567", 10);
        studente1.addEsami("Programmazione");
        studente1.addEsami("Statistica");
        studente1.addEsami("Analisi");
        
        Esame esamePassato = new Esame("Programmazione", 28, LocalDate.of(2025, 2, 24));
        studente1.addEsamiPassati(esamePassato);
        Esame statistica = new Esame("Statistica", 30, LocalDate.of(2025, 01, 02));
        studente1.addEsamiPassati(statistica);
        Esame analisi = new Esame("Analisi", 18, LocalDate.of(2025, 01, 04));
        studente1.addEsamiPassati(analisi);
        System.out.println(studente1.toString());
        studente1.stampaEsamiPassati();
    }

}
