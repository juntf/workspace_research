package DS02P02Queue;

public class QueueInArray implements Queue {

    public static final int CAPACITY = 10024;
    protected int capacity;
    protected Object[] Q;
    protected int frontIndex = 0;
    protected int tailIndex = 0;

    public QueueInArray(int capacity) {
        this.capacity = capacity;
        Q = new Object[capacity];
    }

    public QueueInArray(){
        this(CAPACITY);
    }



    @Override
    public int getSize() {
        return (capacity - frontIndex + tailIndex) % capacity;
    }

    @Override
    public boolean isEmpty() {
        return frontIndex == tailIndex;
    }

    @Override
    public Object front() throws ExceptionQueueFull {
        if(isEmpty()) {
            throw new ExceptionQueueEmpty("Error: Queue Empty; ");
        }
        return Q[frontIndex];
    }

    @Override
    public void enqueue(Object obj) throws ExceptionQueueEmpty {
        if(this.getSize() == (capacity - 1)) {
            throw new ExceptionQueueEmpty("Error: Queue Overflow; ");
        }
        Q[tailIndex] = obj;
        tailIndex = (tailIndex + 1 ) % capacity;
    }

    @Override
    public Object dequeue() throws ExceptionQueueEmpty {
        Object item;
        if(isEmpty()) {
            throw new ExceptionQueueEmpty("Error: Queue Empty; ");
        }
        item = Q[frontIndex];
        frontIndex = (frontIndex + 1) % capacity;
        return item;
    }

    @Override
    public void Traversal() {
        for(int i = frontIndex; i  < tailIndex; i++) {
            System.out.println(Q[i] +  " ");
        }
        System.out.println();
    }
}
