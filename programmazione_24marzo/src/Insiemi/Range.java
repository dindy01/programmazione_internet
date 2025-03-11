package Insiemi;
import java.lang.UnsupportedOperationException;
public class Range {
    private int lower, upper;
    
    public Range() {
        lower = 1;
        upper = 0;
    }
    
    public Range(int x) {
        lower = upper = x;
    }
    
    public Range(int x, int y) {
        try {
            lower = x;
            upper = y;
        } catch (IllegalArgumentException e) {
            System.out.println("controlla che x non sia maggiore di y");
        }
    }
    
    public int getLower() {
        if(isEmpty()) {
            throw new UnsupportedOperationException("Intervallo vuoto");
        }
        return lower;
    }
    
    public int getUpper() {
        if(isEmpty()) {
            throw new UnsupportedOperationException("Intervallo vuoto");
        }
        return upper;
    }
    
    public void setLower(int newLower) {
        if(isEmpty()) {
            throw new UnsupportedOperationException("Intervallo vuoto");
        }
        lower = newLower;
        
    }
    
    public void setUpper(int newUpper) {
        if(isEmpty()) {
            throw new UnsupportedOperationException("Intervallo vuoto");
        }
        upper = newUpper;
    }
    
    public long size() {
        return (long)upper - lower + 1;
    }
    
    private boolean isEmpty() {
        if(lower == 1 && upper == 0)
            return true;
        else 
            return false;
    }
    
    public boolean contains(int x) {
        return x >= lower && x <= upper;
    }
    
    public String toString() {
        return lower + ".." + upper;
    }
    
    public boolean equals(Range r) {
        return lower == r.lower && upper == r.upper;
    }
}

