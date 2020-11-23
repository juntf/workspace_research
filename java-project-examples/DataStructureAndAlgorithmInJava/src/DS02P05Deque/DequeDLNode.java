package DS02P05Deque;

import DS02P02Queue.ExceptionQueueEmpty;

/**
 * Book-P65;
 * PDF-P77;
 */


public class DequeDLNode implements Deque {

    protected DLNode header;
    protected DLNode trailer;
    protected int size;

    public DequeDLNode() {
        header = new DLNode();
        trailer = new DLNode();
        header.setNext(trailer);
        trailer.setPrev(header);
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return 0 == size;
    }

    @Override
    public Object first() throws ExceptionQueueEmpty {
        if (isEmpty()) {
            throw new ExceptionQueueEmpty("Error: Deque Empty; ");
        }

        return header.getNext().getElem();
    }

    @Override
    public Object last() throws ExceptionQueueEmpty {
        return trailer.getPrev().getElem();
    }

    @Override
    public void insertFirst(Object obj) {
        DLNode second = header.getNext();
        DLNode first = new DLNode(obj, header, second);
        second.setPrev(first);
        header.setNext(first);
        size++;
    }

    @Override
    public void insertLast(Object obj) {
        DLNode second = trailer.getPrev();
        DLNode first = new DLNode(obj, second, trailer);
        second.setNext(first);
        trailer.setPrev(first);
    }

    @Override
    public Object removeFirst() throws ExceptionQueueEmpty {
        if (isEmpty()) {
            throw new ExceptionQueueEmpty("Error: Deque Empty; ");
        }
        DLNode first = header.getNext();
        DLNode second = first.getNext();
        header.setNext(second);
        second.setPrev(header);
        size--;

        Object obj = first.getElem();

        return obj;
    }

    @Override
    public Object removeLast() throws ExceptionQueueEmpty {
        if (isEmpty()) {
            throw new ExceptionQueueEmpty("Error: Deque Empty; ");
        }
        DLNode first = trailer.getPrev();
        DLNode second = first.getPrev();
        trailer.setPrev(second);
        second.setNext(trailer);
        size--;
        Object obj = first.getElem();
        return obj;
    }

    @Override
    public void Traversal() {
        DLNode p = header.getNext();
        while (p != trailer) {
            System.out.print(p.getElem() + " ");
            p = p.getNext();
        }

        System.out.print("");
    }
}
