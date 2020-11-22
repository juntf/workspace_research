package DS02P05Deque;

import DS02P02Queue.ExceptionQueueEmpty;

/**
 * Book-P59;  PDF-P71;
 */

public interface Deque {
    public int getSize();
    public boolean isEmpty();
    public Object first() throws ExceptionQueueEmpty;
    public Object last() throws ExceptionQueueEmpty;
    public void insertFirst(Object obj);
    public void insertLast(Object obj);
    public Object removeFirst() throws ExceptionQueueEmpty;
    public Object removeLast() throws ExceptionQueueEmpty;

    public void Traversal();
}
