package classi;
import java.util.Scanner;
/**
04:   Questo programma calcola il valore medio e il valore massimo
05:   di un insieme di dati forniti in ingresso.
06: */
public class DataAnalyzer {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DataSet data = new DataSet(); 
        
        boolean done = false;
        while(!done) {
            System.out.print("Enter value, Q to quit: ");
            String input = in.next();
            if (input.equalsIgnoreCase("Q"))
                done = true;
            else {
                double x = Double.parseDouble(input);
                data.add(x);
            }
        } //end while
        
        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMaximum());
    }
}
