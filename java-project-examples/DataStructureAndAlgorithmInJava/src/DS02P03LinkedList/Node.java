package DS02P03LinkedList;

public class Node implements Position {
    private Object element;
    private Node next;

    public Node() {
        this(null, null);
    }

    public Node(Object e, Node n) {
        element = e;
        next = n;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node newNext) {
        next = newNext;
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
