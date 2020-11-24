package DS03P01Vector;

public class VectorExtendableArray implements Vector{

    private int CAPACITY = 8;
    private int size;

    private Object Ds[];

    public VectorExtendableArray() {
        Ds = new Object[CAPACITY];
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
       return null;
    }

    @Override
    public Object replaceAtRank(int r, Object obj) {
        return null;
    }

    @Override
    public Object insertAtRank(int r, Object obj) throws ExceptionBoundaryViolation {
        if(0 > r ||  r >= size) throw new ExceptionBoundaryViolation("Error: Rank Over");
        if(size >= CAPACITY) {

            CAPACITY *= 2;
            Object[] DsEx = new Object[CAPACITY];  // Extend-Array-Capacity;

            for(int i=0; i < size; i++) {
                DsEx[i] = Ds[i];
            }

            Ds = DsEx;   // GC;
        }

        for(int i = size; i > r;  i--) {
            Ds[i] = Ds[i-1];
        }

        Ds[r] = obj;
        size++;     // Update-Size;

        return obj;
    }

    @Override
    public Object removeAtRank(int r) throws ExceptionBoundaryViolation {
        return null;
    }
}
