package DS03P02List;

import DS02P03LinkedList.Position;
import DS03P01Vector.ExceptionBoundaryViolation;

import java.util.Iterator;


// PDF-P96;  Book-P84;

public interface List {

    public int getSize();
    public boolean isEmpty();

    public Position first() throws ExceptionListEmpty;

    public Position last();


    public Position getNext(Position p) throws ExceptionPositionInvalid, ExceptionBoundaryViolation;

    public Position getPrev(Position p) throws ExceptionPositionInvalid, ExceptionBoundaryViolation;

    public Position insertFirst(Object e);

    public Position insertLast(Object e);

    public Position insertAfter(Position p, Object e) throws ExceptionPositionInvalid;

    public Position insertBefore(Position p, Object e) throws ExceptionPositionInvalid;

    public Object remove(Position p) throws ExceptionPositionInvalid;

    public Object removeFirst();
    public Object removeLast();

    public Object replace(Position p, Object e) throws ExceptionPositionInvalid;

    public Iterator positions();

    public Iterator elements();
}
