package lista;

public class ListaConcatenataDiStringheDemo {

    public static void main(String[] args) {
        ListaConcatenataDiStringhe lista = new ListaConcatenataDiStringhe();
        lista.aggiungiNodoInTesta("Uno");
        lista.aggiungiNodoInTesta("Due");
        lista.aggiungiNodoInTesta("Tre");
        System.out.println("La lista ha " + lista.lunghezza() + " elementi.");
        lista.mostraLista();
        
        if (lista.nellaLista("Tre"))
            System.out.println("Tre è sulla lista");
        else 
            System.out.println("Tre NON è sulla lista.");
        lista.eliminaNodoDiTesta();
        
        if (lista.nellaLista("Tre"))
            System.out.println("Tre è sulla lista");
        else 
            System.out.println("Tre NON è sulla lista.");
        lista.eliminaNodoDiTesta();
        lista.eliminaNodoDiTesta();
        System.out.println("Inizio della lista:");
        lista.mostraLista();
        System.out.println("Fine della lista.");
        /*
        ListaDoppia listaDoppia= new ListaDoppia();
        listaDoppia.aggiungiNodoInTesta("cappotto");
        listaDoppia.aggiungiNodoInTesta("scarpe");
        listaDoppia.aggiungiNodoInTesta("calzini");
        System.out.println("Lunghezza lista: " + listaDoppia.lunghezza());
        listaDoppia.mostraDoppiaLista();
        if(listaDoppia.nellaLista("Tre"))
            System.out.println("Tre è sulla lista" + listaDoppia.trova("Tre"));            
        else
            System.out.println("Tre Non è sulla lista");
        
        listaDoppia.aggiungiNodoInTesta("Tre");
        if(listaDoppia.nellaLista("Tre"))
            System.out.println("Tre è sulla lista");
        else
            System.out.println("Tre NON è sulla lista");
        listaDoppia.eliminaNodoInTesta();
        listaDoppia.eliminaNodoInTesta();
        listaDoppia.eliminaNodoInTesta();
        listaDoppia.eliminaNodoInTesta();
        System.out.println("inizio lista");
        listaDoppia.mostraDoppiaLista();
        System.out.println("fine lista");
        */
        ListaDoppia listaPalindroma = new ListaDoppia();
        listaPalindroma.aggiungiNodoInTesta(1);
        listaPalindroma.aggiungiNodoInTesta(2);
        listaPalindroma.aggiungiNodoInTesta(5);
        listaPalindroma.aggiungiNodoInTesta(2);
        listaPalindroma.aggiungiNodoInTesta(4);
        
        listaPalindroma.mostraDoppiaLista();
       if( listaPalindroma.isPalindrome(listaPalindroma))
           System.out.println("Lista palindroma");
       else
           System.out.println("non palindroma");
    
    }
}
