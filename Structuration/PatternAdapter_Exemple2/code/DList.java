package Structuration.PatternAdapter_Exemple2.code;

public class DList {
    protected DNode head;
    private DNode tail;

   public DList() {
       this.head = null;
       this.tail = null;
   }

   public void insertHead(Object o) {
       DNode newNode = new DNode(o);
       if (isEmpty()) {
           this.head = newNode;
           this.tail = newNode;
       } else {
           newNode.setNext(head);
           this.head.setPrev(newNode);
           this.head = newNode;
       }
   }

   public void insertTail(Object o) {
       DNode newNode = new DNode(o);
       if (isEmpty()) {
           this.head = newNode;
           this.tail = newNode;
       } else {
           newNode.setPrev(this.tail);
           this.tail.setNext(newNode);
           this.tail = newNode;
       }
   }

   public void printForward() {
       DNode currentNode = head;
       while (currentNode != null) {
           System.out.println(currentNode.getData() + " ");
           currentNode = currentNode.getNext();
       }
       System.out.println();
   }

   public void printBackward() {
       DNode currentNode = tail;
       while (currentNode != null){
           System.out.println(currentNode.getData() + " ");
           currentNode = currentNode.getPrev();
       }
       System.out.println();
   }

   public Object getHead(){
       if(isEmpty()) {
           return null;
       }
       return this.head.getData();
   }

   public Object getTail() {
       if (isEmpty()) {
           return null;
       }
       return this.tail.getData();
   }

   public Object removeHead() {
       if (isEmpty()) {
           return null;
       }

       Object removedData = this.head.getData();

       if(this.head == this.tail) {
           this.head = null;
           this.tail = null;
       } else {
           this.head = this.head.getNext();
           this.head.setPrev(null);
       }
       return removedData;
   }

   public Object removeTail() {
       if (isEmpty()) {
           return null;
       }

       Object removedData = this.tail.getData();

       if (this.head == this.tail) {
           this.head = null;
           this.tail = null;
       } else {
           this.tail = this.tail.getPrev();
           this.tail.setNext(null);
       }
       return removedData;
   }

   public void remove (DNode pos) {
       if (pos == null) {
           return;
       }
       DNode prevNode = pos.getPrev();
       DNode nextNode = pos.getNext();

       if(prevNode != null) {
           prevNode.setNext(nextNode);
       } else {
           this.head = nextNode;
       }

       if (nextNode != null) {
           nextNode.setPrev(prevNode);
       } else {
           this.tail = prevNode;
       }
   }

   public void insert(DNode pos, Object o) {
       if (pos == null) {
           return;
       }

       DNode newNode = new DNode(o);
       DNode prevNode = pos.getPrev();

       newNode.setPrev(prevNode);
       newNode.setNext(pos);

       if(prevNode != null) {
           prevNode.setNext(newNode);
       } else {
           this.head = newNode;
       }

       pos.setPrev(newNode);
   }
   public boolean isEmpty() {
       return this.head == null;
   }
}
