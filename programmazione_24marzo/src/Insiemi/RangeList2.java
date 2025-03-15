package Insiemi;

import java.util.Arrays;

public class RangeList2 {
    private RangeNode head;
    private RangeNode tail;
    private int size;
    
    public RangeList2() {
        head = null;
        tail = null;
    }
    
    public RangeList2(int x) {
        head = new RangeNode(new Range(x, x), null, null);
        tail = head;
        size++;
    }
    
    public RangeList2(int x, int y) {
        head = tail = new RangeNode(new Range(x, y), null, null);
        size++;
    }
    
    public RangeList2(int[] a) {
        Arrays.sort(a);
        int[] a1 = new int[a.length];
        
        if(a.length == 0) {
            head = tail = null;
        }
        
        for(int i = 0; i < a.length; i++) {
            a1[i] = a[i];
        }
        
        head = new RangeNode(new Range(a1[0], a1[0]), null, null);
        RangeNode p = head;
        for(int i = 1; i < a.length; i++) {
            if(a1[i] > a[i - 1] + 1) {
                RangeNode q = new RangeNode(new Range(a1[i], a[i]), null, p);
                p.next = q;
                tail = q;
                p = q;
                size += q.range.size();
            } else if (a1[i] > a[i - 1]) {
                int oldSize = (int)p.range.size();
                p.range.setUpper(a1[i]);
                int newSize = (int)p.range.size();
                size += (newSize - oldSize);
            }
        }
    }
    /*
     * implemento unione e intersezione
     */
    public RangeList2 union(RangeList2 list1, RangeList2 list2) {
        if (list1.head == null)
            return list2;
        else if (list2.head == null)
            return list1;
        RangeList2 unitedList = new RangeList2();
        RangeNode list1node = list1.head;
        RangeNode list2node = list2.head;
        Range unitedRange = null;
        
        while(list1node != null || list2node != null) {
            Range nextRange;
            if(list1node != null && (list2node == null || list1node.range.getLower() <= list2node.range.getLower())) {
                // Preleviamo l'intervallo da list1
                nextRange = new Range(list1node.range.getLower(), list1node.range.getUpper());
                list1node = list1node.next;
            } else {
                nextRange = new Range(list2node.range.getLower(), list2node.range.getUpper());
                list2node = list2node.next;
            }
            
            if(unitedRange== null) {
                unitedRange = nextRange;
            } else {
                
                if(nextRange.getLower() <= unitedRange.getUpper() + 1) {
                    unitedRange.setUpper(Math.max(unitedRange.getUpper(), nextRange.getUpper()));
                } else {
                    
                    unitedList.addInterval(unitedRange);
                    unitedRange = nextRange;
                }
            }
        }
        
        if(unitedRange != null) {
            unitedList.addInterval(unitedRange);
        }
        return unitedList;
    }
    
    public void addInterval(Range r) {
        RangeNode newNode = new RangeNode(r, null, tail);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size += r.size();
    }
    
    private class RangeNode {
        private Range range;
        private RangeNode next;
        private RangeNode prev;
        
        
        private RangeNode(Range x, RangeNode next, RangeNode prev) {
            this.range = x;
            this.next = next;
            this.prev = prev;
        }
        
        private Range getRange() {
            return range;
        }
        
        private RangeNode getNext() {
            return next;
        }
        
        private RangeNode getPrev() {
            return prev;
        }
        
        private void setRange(Range newRange) {
            range = newRange;
        }
        
        private void setNext(RangeNode newNext) {
            next = newNext;
        }
        
        private void setPrev(RangeNode newPrev) {
            prev = newPrev;
        }
    }
}
