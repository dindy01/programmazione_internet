package arrayList;
import java.util.ArrayList;

public class DList {
    
    private DNode head;
    private DNode tail;
    private int length;
    
    public DList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    
    public DList(double x) {
        DNode newNode = new DNode(x, null, null);
        head = tail = newNode;
        length = 1;
    }
    
    public DList(double[] a) {
        this();
        for(double value : a) {
            append(value);
        }
    }
    
    public void append(double x) {
        DNode newNode = new DNode(x, tail, null);
        if(tail != null) {
            tail.setNext(newNode);
        } else {
            head = newNode;
        }
        tail = newNode;
        length++;
    }
    
    public boolean isEmpty() {
        if(tail != null) 
            return false;
        else 
            return true;
    }
    
    public int size() {
        return length;
    }
    
    public String toString() {
        if(head == null) {
            return "[]" ;
        }
        String result = "[" + head.getVal();
        DNode current = head.getNext();
        while(current != null) {
            result += ", " + current.getVal();
            current = current.getNext();
        }
        
        result += "]";
        return result;
    }
    
    public double get(int i) {
        if(i >= length || i < 0) {
            System.out.println("NaN");
            return Double.NaN;
        } 
        
        DNode current = head;
        for(int count = 0; count < i; count++) {
            current = current.getNext();
        }
        
        return current.getVal();
    }
    
    public void set(int i, double x) {
        if(i < 0 || i >= length) {
            System.out.println("Errore");
        }
        
        DNode current = head;
        for(int count = 0; count < i; count++ ) {
            current = current.getNext();
        }
        current.setVal(x);
    }
    
    public void pushFront(double x) {
        DNode newNode = new DNode(x,null, head);
        if(head != null) {
            head.setPrev(newNode);   
        } else {
            tail = newNode;
        }
        head = newNode;
        length++;
    }
    
    public void pushBack(double x) {
        DNode newNode = new DNode(x, tail, null);
        if(tail != null) {
            tail.setNext(newNode);
        } else {
            head = newNode;
        }
        tail = newNode;
        length++;
    }
    
    public void popFront() {

        /*
         * head diventa il secondo elemento
         */
        head = head.getNext();
        
        if(head != null) {
            head.setPrev(null);    
        } else {
            /*
             * Se la lista diventa vuota dopo la riga 116
             * es. se la lista ha solo un elemento head.getNExt è null
             * qyindi anche tail deve essere null
             */
            tail = null;
        }
        length--;
    }
    
    public void popBack() {
        if(head == null) {
            return; //lista già vuota
        }
        
        /*
         * tail qui diventa il penultimo elemento
         */
        tail = tail.getPrev();
        
        if(tail != null) {
            tail.setNext(null);
        } else {
            head = null;
        }
        length--;
    }
    
    public void clear() {
        if(head == null) {
            return;
        }
        
        if(head != null) {
            head = null;
            tail = null;
        }
        length = 0;
    }
    
    public void delete(int i) {
        if (i < 0 || i >= length) {
            System.out.println("indice non valido");
            return;
        }
        
        //Trova il nodo da eliminare
        DNode current = head;
        for(int count = 0; count < i; count++) {
            current = current = current.getNext();
        }
        
        //Se current è il primo nodo(head)
        if(current == head) {
            head = current.getNext();
            if(head != null) {
                head.setPrev(null);
            }
        } else {
            // Collega il nodo precedente a quello successivo
            /*
             * Se il nodo da eliminare è tail, allora current.getNext() è null, 
             * e quindi il nodo precedente ha il suo next 
             * impostato a null (che è corretto).
             */
            current.getPrev().setNext(current.getNext());
        }
        
        // Se current è l'ultimo nodo(tail)
        if (current == tail) {
            tail = current.getPrev();
            if (tail != null) {
                tail.setNext(null);
            }
        } else {
            //Collega il nodo successivo a quello precedente
            current.getNext().setPrev(current.getPrev());
        }
        
        length--;
    }
    
    public void insert(int i, double x) {
        if (i < 0 || i > length) {
            System.out.println("Indice non valido");
            return;
        }
        
        // Se inserisci in testa o in coda, sfrutta i metodi già
        if (i == 0) {
            pushFront(x);
            return;
        }
        if (i == length) {
            pushBack(x);
            return;
        }
        
        //Trova il nodo in posizione i
        DNode current = head;
        for (int count = 0; count < i; count++) {
            current = current.getNext();
        }
        
        /*
         * Crea il nuovo nodo: il suo prev sarà il nodo precedente
         * di current, il suo next sarà current
         */
        DNode newNode = new DNode(x, current.getPrev(), current);
        
        //Collega il nodo precedente al nuovo nodo
        current.getPrev().setNext(newNode);
        //Collega current al nuovo nodo come nodo precedente 
        current.setPrev(newNode);
        
        length++;
    }
    
    public double sum() {
        double sum = 0;
        DNode current = head;
        while(current != null) {
            sum += current.getVal();
            current = current.getNext();
        }
        return sum;
    }
    
    public ArrayList toArrayList() {
        ArrayList<Double> lista = new ArrayList();
        DNode current = head;
        while(current != null) {
            lista.add(current.getVal());
            current = current.getNext();
        }
        return lista;
    }
    
    public boolean palindrome() {
        DNode current = head; 
        int count = 0;
        while(current != null) {
            count++;
            current = current.getNext();
        }
        double[] array = new double[count];
        int i = 0;
        current = head;
        while(current != null) {
            array[i] = current.getVal();
            current = current.getNext();
            i++;
        }
        
        int right = array.length - 1;
        int left =  0;
        while(left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public void sort() {
        /*
         * implemento bubble sort
         */
        /*
         * i = 0 i < a.length; i++
         *  swapped = false
         *  j = 0 j < a.length - i - 1; j++
         *   if(a[j] > a[j + 1])
         *    int temp = a[j+1]
         *    a[j + 1] = a[j]
         *    a[j] = temp
         *    swapped = true
         *    }
         *    if(!swapped)
         *      break
         *     
         */
        double temp;
        boolean swapped;
        do {
            swapped = false;
            DNode current = head;
            while (current.getNext() != null) {
                if(current.getVal() > current.getNext().getVal()) {
                    temp = current.getVal();
                    current.setVal(current.getNext().getVal());
                    current.getNext().setVal(temp);
                    swapped = true;
                }
                current = current.getNext();
            }
        } while (swapped);
    }
    
    public void unique() {
        if(head == null) {
            return;
        }
        DNode current = head;
        while(current.getNext() != null) {
            if(current.getVal() == current.getNext().getVal()) {
                //DUplicato trovato
                DNode duplicate = current.getNext();
                current.setNext(duplicate.getNext());
                if(duplicate.getNext() != null) {
                    duplicate.getNext().setPrev(current);
                } else {
                    tail = current;
                }
            } else {
            current = current.getNext();
            }
        }
    }
}
 
