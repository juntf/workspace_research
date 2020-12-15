package DS03P02List;

import DS02P02Queue.ExceptionQueueEmpty;
import DS02P03LinkedList.Position;
import DS02P05Deque.DLNode;
import DS03P01Vector.ExceptionBoundaryViolation;
import DS03P04Iterator.IteratorElements;
import DS03P04Iterator.IteratorPosition;


import java.util.Iterator;


public class List_DLNode implements List {

    protected int numElem ;
    protected DLNode header,trailer;

    public List_DLNode() {
        numElem = 0;
        header = new DLNode(null, null, null);
        trailer = new DLNode(null, header, null);

        header.setNext(trailer);
    }

    // Helper Methods;
    protected DLNode checkPosition(Position p) throws ExceptionPositionInvalid {
        if (null == p) {
            throw new ExceptionPositionInvalid("传递给List_DLNode的位置是null");
        }

        if(header == p) {
            throw new ExceptionPositionInvalid("Error: 头节点哨兵位置非法");
        }

        if(trailer == p) {
            throw new ExceptionPositionInvalid("Error: 尾节点哨兵位置非法");
        }

        DLNode tmp = (DLNode) p;

        return tmp;
    }



    public int getSize() {
        return numElem;
    }

    @Override
    public boolean isEmpty() {
        return numElem == 0;
    }

    @Override
    public Position first() throws ExceptionListEmpty {
        if(isEmpty()) {
            throw new ExceptionListEmpty("Error: ListEmpty");
        }
        return header.getNext();
    }

    @Override
    public Position last() throws ExceptionListEmpty {
        if(isEmpty()) {
            throw new ExceptionListEmpty("Error: ListEmpty");
        }

        return trailer.getPrev();
    }

    @Override
    public Position getNext(Position p) throws ExceptionPositionInvalid, ExceptionBoundaryViolation {
        DLNode v = checkPosition(p);
        DLNode prev = v.getPrev();
        if(prev == header) {
            throw new ExceptionBoundaryViolation("Error: 企图越过列表前端");
        }
        return prev;
    }

    @Override
    public Position getPrev(Position p) throws ExceptionPositionInvalid, ExceptionBoundaryViolation {
        DLNode v = checkPosition(p);
        DLNode next = v.getNext();
        if(next == trailer) {
            throw new ExceptionBoundaryViolation("Error: 企图越过列表后端");
        }
        return next;
    }

    @Override
    public Position insertFirst(Object e) {
        numElem++;
        DLNode newNode = new DLNode(e, header, header.getNext());
        header.getNext().setPrev(newNode);
        header.setNext(newNode);

        return null;
    }

    @Override
    public Position insertLast(Object e) {
        numElem++;
        DLNode newNode = new DLNode(e, trailer.getPrev(), trailer);
        if(trailer.getPrev() == null) {
            System.out.println("尾节点的前驱为NULL");
        }
        trailer.getPrev().setNext(newNode);
        trailer.setPrev(newNode);
        return newNode;
    }

    @Override
    public Position insertAfter(Position p, Object e) throws ExceptionPositionInvalid {
        DLNode v = checkPosition(p);
        numElem++;
        DLNode newNode = new DLNode(e, v.getNext(), v);
        v.getPrev().setNext(newNode);
        v.setPrev(newNode);
        return newNode;
    }

    @Override
    public Position insertBefore(Position p, Object e) throws ExceptionPositionInvalid {
        DLNode v = checkPosition(p);
        numElem++;
        DLNode newNode = new DLNode(e, v.getPrev(), v);
        v.getPrev().setNext(newNode);
        v.setPrev(newNode);
        return newNode;
    }

    @Override
    public Object remove(Position p) throws ExceptionPositionInvalid {
        DLNode v = checkPosition(p);
        numElem--;
        DLNode vPrev = v.getPrev();
        DLNode vNext = v.getNext();
        vPrev.setNext(vNext);
        vNext.setPrev(vPrev);
        Object vEement = v.getElem();
        v.setNext(null);
        v.setPrev(null);
        return vEement;
    }

    @Override
    public Object removeFirst() {
        return this.remove(header.getNext());
    }

    @Override
    public Object removeLast() {
        return this.remove(trailer.getPrev());
    }

    @Override
    public Object replace(Position p, Object e) throws ExceptionPositionInvalid {
        DLNode v = checkPosition(p);
        Object oldElem = v.getElem();
        v.setElem(e);
        return oldElem;
    }

    @Override
    public Iterator positions() {
        return new IteratorPosition(this);
    }

    @Override
    public Iterator elements() {
        return new IteratorElements(this);
    }


}
