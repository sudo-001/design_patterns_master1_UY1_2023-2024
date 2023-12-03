package Structuration.PatternAdapter_Exemple2.code;

public class DListImpStack extends DList implements Stack{
    public void push (Object o) {
        insertTail(o);
    }

    public Object pop() {
        return removeTail();
    }

    public Object top() {
        return getTail();
    }



}
