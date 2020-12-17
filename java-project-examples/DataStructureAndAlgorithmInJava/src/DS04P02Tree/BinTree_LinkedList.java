package DS04P02Tree;

import java.util.Iterator;

// PDF-P144; Book-P132;

public class BinTree_LinkedList implements BinaryTree {
    protected BinaryTreePosition root;

    public BinTree_LinkedList() {
        this(null);
    }

    public BinTree_LinkedList(BinaryTreePosition r) {
        root = r;
    }
    @Override
    public BinaryTree getRoot() {
        return root;
    }

    @Override
    public boolean isEmpty() {
        return null == root;
    }

    @Override
    public int getSize() {
        return isEmpty() ? 0 : root.getSize();
    }

    @Override
    public int getHeight() {
        return isEmpty() ? -1 : root.getHeight();
    }

    @Override
    public Iterator elementsPreOrder() {
        return root.elementsPreOrder();
    }

    @Override
    public Iterator elementsInOrder() {
        return root.elementsInOrder();
    }

    @Override
    public Iterator elementsPostOrder() {
        return root.elementsPostOrder();
    }

    @Override
    public Iterator elementsLevelOrder() {
        return root.elementsLevelOrder();
    }
}
