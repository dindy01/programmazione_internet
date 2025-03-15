package Insiemi;
import java.util.Arrays;

public class RangeList {
    private RangeNode head;
    
   public RangeList() {
       head = null;
   }
   
   public RangeList(int x) {
       head = new RangeNode(new Range(x, x), null);
   }
   
   public RangeList(int x, int y) {
       head = new RangeNode(new Range(x, y), null);
   }
   
   public RangeList(int[] a) {
       // Ordiniamo l'array per garantire che gli elementi siano in ordine crescente
       Arrays.sort(a);
       
       // Se l'array è vuoto, la lista sarà vuota
       if (a.length == 0) {
           head = null;
           return;
       }
       
       // Creiamo un nuovo array per evitare di modificare l'array originale
       int[] A1 = new int[a.length];
       for (int i = 0; i < a.length; i++) {
           A1[i] = a[i];
       }
       
       // Creiamo il primo nodo con il primo elemento come intervallo iniziale
       head = new RangeNode(new Range(A1[0], A1[0]), null);
       RangeNode p = head; // Puntatore all'ultimo nodo della lista
       
       // Scorriamo il resto dell'array
       for (int i = 1; i < a.length; i++) {
           // Se l'elemento attuale non è consecutivo al precedente
           if (A1[i] > A1[i - 1] + 1) {
               // Creiamo un nuovo nodo con il nuovo intervallo
               RangeNode q = new RangeNode(new Range(A1[i]), null);
               
               // Colleghiamo il nuovo nodo alla lista
               p.next = q;
               
               // Aggiorniamo il puntatore p al nuovo nodo
               p = q;
           }
           // Se l'elemento attuale è consecutivo al precedente
           else if (A1[i] > A1[i - 1]) {
               // Estendiamo l'upper bound dell'intervallo corrente
               p.range.setUpper(A1[i]);
           }
       }
   }
   
   public String toString() {
       if(head ==  null) {
           return "{}";
       }
       if (head.next == null) {
           if (head.range.size() == 1)
               return "{" + head.range.getLower() + "}";
       }  else {
           return head.range.toString();
       }
       String s = "{";
       RangeNode p = head;
       do {
           Range r = p.range;
           s += r.getLower();
           if(r.size() > 1)
               s += ".." + r.getUpper();
           p = p.next;
           if (p != null)
               s += ", ";
       } while (p != null);
       return s + "}";
   }
   
   public boolean isEmpty() {
       return head == null;
   }
   
   public long size() {
       long n = 0;
       RangeNode p = head;
       while(p != null) {
           n += p.range.size();
           p = p.next;
       }
       return n;
   }
   
   public int min() {
       if(head == null)
           throw new UnsupportedOperationException("min on empty set");
       return head.range.getLower();
   }
   
   public int max() {
       if (head == null)
           throw new UnsupportedOperationException("max on empty set");
       
       RangeNode p = head;
       int max = p.range.getUpper();
       
       while (p != null) {
           if (p.range.getUpper() > max) {
               max = p.range.getUpper();
           }
           p = p.next;
       }
       return max;
   }
   
   public boolean contains(int x) {
       RangeNode p = head;
       while(p != null) {
           if(x >= p.range.getLower() && x <=
                               p.range.getUpper()) {
               return true;
           }
           p = p.next;
       }
       return false;
   }
   
   public boolean equals(RangeList x) {
       if (this == x)
           return true;
       if (head == null || x.head == null)
           return head == x.head;
       
       RangeNode p1 = head;
       RangeNode p2 = x.head;

       while (p1 != null && p2 != null) {
           if (!p1.range.equals(p2.range)) {
               return false;
           }
           p1 = p1.next;
           p2 = p2.next;
       }

       return p1 == p2; // If both are null, the lists are equal
   }
   
   
    private class RangeNode{
        private Range range;
        private RangeNode next;
        
        private RangeNode(Range x, RangeNode next) {
            this.range = x;
            this.next = next;
        }
        
        private Range getRange() {
            return range;
        }
        
        private RangeNode getNext() {
            return next;
        }
        
        private void setRange(Range newRange) {
            range = newRange;
        }
        
        private void setNext(RangeNode newNext) {
            next = newNext;
        }
        
    }
}
