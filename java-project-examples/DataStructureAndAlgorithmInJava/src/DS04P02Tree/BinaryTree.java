package DS04P02Tree;

import java.util.Iterator;

public interface BinaryTree {
    public BinaryTree getRoot();
    public boolean isEmpty();
    public int getSize();
    public int getHeight();

    public Iterator elementsPreOrder();

    public Iterator elementsInOrder();
    public Iterator elementsPostOrder();
    public Iterator elementsLevelOrder();
}
