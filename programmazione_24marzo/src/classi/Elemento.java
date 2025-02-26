package classi;

public enum Elemento{
    IDROGENO("H", 1, 1.008),
    ELIO("He", 2, 4.003),
    // ... altri elementi
    LITIO("Li", 3, 6.491);
    
    private int numeroAtomico;
    private double massaAtomica;
    private String simbolo;
    
    public int getNumeroAtomico() {
        return numeroAtomico;
    }
    
    public String getSimbolo() {
        return simbolo;
    }
    
    private Elemento(String simbolo, int numeroAtomico, double massaAtomica) {
        this.simbolo = simbolo;
        this.numeroAtomico = numeroAtomico;
        this.massaAtomica = massaAtomica;
    }
}