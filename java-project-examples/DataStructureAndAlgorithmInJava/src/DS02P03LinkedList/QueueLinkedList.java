package DS02P03LinkedList;

import DS02P02Queue.ExceptionQueueEmpty;
import DS02P02Queue.ExceptionQueueFull;
import DS02P02Queue.Queue;

public class QueueLinkedList implements Queue {

    protected Node head;
    protected Node tail;
    protected int size;

    public QueueLinkedList() {
        head = null;
        tail = null;
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
    public Object front() throws ExceptionQueueFull {
        if (isEmpty()) {
            throw new ExceptionQueueEmpty("Error: Queue Empty; ");
        }
        return head.getElem();
    }

    @Override
    public void enqueue(Object obj) throws ExceptionQueueEmpty {
        Node newVal = new Node();
        newVal.setElem(obj);
        newVal.setNext(null);
        if (isEmpty()) {
            head = newVal;
        } else {
            tail.setNext(newVal);
        }

        tail = newVal;
        size++;
    }

    @Override
    public Object dequeue() throws ExceptionQueueEmpty {
        if (isEmpty()) {
            throw new ExceptionQueueEmpty("Error: Queue Empty; ");
        }

        Object obj = head.getElem();
        head = head.getNext();
        size--;

        if (0 == size) {
            tail = null;
        }
        return obj;
    }

    @Override
    public void Traversal() {
        Node p = head;
        while (p != null) {
            System.out.print(p.getElem() + " ");
            p = p.getNext();
        }
    }
}
