package arrayList;

public class DNode {
    private DNode next;
    private DNode prev;
    private double val;
    
    public DNode(double val, DNode prev, DNode next) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
    
    public double getVal() {
        return val;
    }
    
    public DNode getNext() {
        return next;
    }
    
    public DNode getPrev() {
        return prev;
    }
    
    public void setNext(DNode newNext) {
        this.next = newNext;
    }
    
    public void setPrev(DNode newPrev) {
        this.prev = newPrev;
    }
    
    public void setVal(double newVal) {
        this.val = newVal;
    }
}
