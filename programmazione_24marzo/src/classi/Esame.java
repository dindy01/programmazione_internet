package classi;
import java.time.LocalDate;

public class Esame {
    private String nome;
    private int voto;
    private LocalDate date;
    
    public Esame(String esame, int voto, LocalDate data) {
        nome = esame;
        this.voto = voto;
        date = data;
    }
    
    public String getEsame() {
        return nome;
    }
    
    public int getVoto() {
        return voto;
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public String toString() {
        return "nome esame: " + nome + " voto: " + voto + " in data: " + date;
    }
}
