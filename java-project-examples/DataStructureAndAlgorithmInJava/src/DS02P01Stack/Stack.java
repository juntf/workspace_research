package DS02P01Stack;

public interface Stack {
    public int getSize();
    public boolean isEmpty();
    public Object top() throws ExceptionStackEmpty;
    public void push(Object item);
    public Object pop() throws ExceptionStackEmpty;
}
