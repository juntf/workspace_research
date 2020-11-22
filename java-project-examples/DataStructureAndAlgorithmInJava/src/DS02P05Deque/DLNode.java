package DS02P05Deque;

import DS02P03LinkedList.Position;

public class DLNode implements Position {

    private Object element;
    private DLNode prev;
    private DLNode next;

    public DLNode() {
        this(null, null, null);
    }

    public DLNode(Object e, DLNode p, DLNode n) {
        element = e;
        prev = p;
        next = n;
    }

    public DLNode getNext() {
        return next;
    }

    public DLNode getPrev() {
        return prev;
    }

    public void setNext(DLNode newNext) {
        next = newNext;
    }

    public void setPrev(DLNode newPrev) {
        next = newPrev;
    }


    @Override
    public Object getElem() {
        return element;
    }

    @Override
    public Object setElem(Object e) {
        Object oldElem = element;
        element = e;
        return oldElem;
    }
}
