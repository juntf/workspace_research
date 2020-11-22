package DS02P03LinkedList;

import DS02P01Stack.ExceptionStackEmpty;
import DS02P01Stack.Stack;
import DS02P03LinkedList.Node;

/**
 * 2.3.2;
 * Book-P53 | PDF-P66;
 */

public class StackLinkedList implements Stack {
    protected Node top;
    protected int size;

    public StackLinkedList() {
        top = null;
        size = 0;
    }



    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (top == null) ? true : false ;
    }

    @Override
    public Object top() throws ExceptionStackEmpty {
        if(isEmpty()) {
            throw new ExceptionStackEmpty("Error: Stack is Empty; ");
        }

        return top.getElem();
    }

    @Override
    public void push(Object item) {
        Node newVal = new Node(item, top);
        top = newVal;
        size++;
    }

    @Override
    public Object pop() throws ExceptionStackEmpty {
        if(isEmpty()) {
            throw new ExceptionStackEmpty("Error: Stack is Empty; ");
        }
        Object tmp = top.getElem();
        top = top.getNext();
        size--;
        return tmp;
    }
}
