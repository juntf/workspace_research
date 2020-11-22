package DS02P02Queue;



public interface Queue {
    public int getSize();
    public boolean isEmpty();
    public Object front() throws ExceptionQueueFull;
    public void enqueue(Object obj) throws ExceptionQueueEmpty;
    public Object dequeue() throws ExceptionQueueEmpty;
    public void Traversal();
}
