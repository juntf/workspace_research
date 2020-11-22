package DS02P01Stack;

public class StackInArray implements Stack {
    public static final int CAPACITY = 1024;  // Array Default capacity;
    protected int capacity;  // Real-Capacity;
    protected Object[] S;  // Object Array;
    protected int top = -1;  // Top-index;


    public StackInArray(int capacity) {
        this.capacity = capacity;
        S = new Object[capacity];
    }

    public StackInArray() {
        this(CAPACITY);
    }

    public int getSize() {
        return (top + 1);
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public void push(Object obj) throws ExceptionStackFull {
        if(this.getSize() == capacity) {
            throw new ExceptionStackFull("Error: Stack is Full; ");
        }

        S[++top] = obj;
    }

    public Object top() throws ExceptionStackEmpty {
        if(isEmpty()) {
            throw new ExceptionStackEmpty("Error: Stack is Empty; ");
        }
        return S[top];
    }

    public Object pop() throws ExceptionStackEmpty {
        Object item;
        if(isEmpty()) {
            throw new ExceptionStackEmpty("Error: Stack is Empty; ");
        }
        item = S[top];
        S[top--] = null;
        return item;
    }
}
