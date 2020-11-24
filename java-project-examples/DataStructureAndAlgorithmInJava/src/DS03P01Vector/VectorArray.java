package DS03P01Vector;

public class VectorArray implements Vector{

    private final int N = 1024; // Array-capacity;
    private int size = 0;  // Real-capacity;

    private Object[] Ds;

    public VectorArray() {
        Ds = new Object[N];
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public Object getAtRank(int r) throws ExceptionBoundaryViolation {
        if(0 > r ||  r >= size) throw new ExceptionBoundaryViolation("Error: Rank Over");
        return Ds[r];
    }

    @Override
    public Object replaceAtRank(int r, Object obj) {
        if(0 > r ||  r >= size) throw new ExceptionBoundaryViolation("Error: Rank Over");
        Object bak = Ds[r];
        Ds[r] = obj;
        return bak;
    }

    @Override
    public Object insertAtRank(int r, Object obj) throws ExceptionBoundaryViolation {
        if(0 > r ||  r >= size) throw new ExceptionBoundaryViolation("Error: Rank Over");
        if(size >= N)  throw new ExceptionBoundaryViolation("Error: Array Over");

        for(int i = size; i > r; i--) {
            Ds[i] = Ds[i-1];
        }

        Ds[r] = obj;
        size++;

        return obj;
    }

    @Override
    public Object removeAtRank(int r) throws ExceptionBoundaryViolation {
        if(0 > r ||  r >= size) throw new ExceptionBoundaryViolation("Error: Rank Over");
        Object bak = Ds[r];
        for(int i  = r;  i < size; i++) {
            Ds[r] = Ds[r+1];
        }
        size--;
        return bak;
    }
}
