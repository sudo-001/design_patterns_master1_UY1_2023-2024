package Structuration.PatternAdapter_Exemple2.code;

public class DNode {
    private Object data;
    private DNode prev;
    private DNode next;

    public DNode(Object data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DNode getPrev() {
        return this.prev;
    }

    public void setPrev(DNode previousNode) {
        this.prev = previousNode;
    }

    public DNode getNext() {
        return this.next;
    }

    public void setNext(DNode nextNode) {
        this.next = nextNode;
    }
}
