package DS04P02Tree;

import java.util.Iterator;
import java.util.List;

public class BinaryTreeNode implements BinaryTreePosition {

    protected Object element;
    protected BinaryTreePosition parent;
    protected BinaryTreePosition lChild;
    protected BinaryTreePosition rChild;

    protected int size;
    protected int height;
    protected int depth;

    public BinaryTreeNode() {
        this(null, null, true, null, null);
    }

    // Constructor;
    public BinaryTreeNode(Object e, BinaryTreePosition p, boolean asLChild, BinaryTreePosition lChild, BinaryTreePosition rChild) {
        size = 1;
        height = depth = 0;
        parent = lChild = rChild = null;

        element = e;

        if (null != p) {
            if (asLChild) {
                p.attachL(this);
            } else {
                p.attachR(this);
            }
        }

        if (lChild != null) {
            attachL(lChild);
        }

        if (rChild != null) {
            attachR(rChild);
        }
    }

    public Object getElement() {
        return element;
    }

    public Object setElement(Object e) {
        Object bak = element;
        element = e;
        return bak;
    }


    @Override
    public boolean hasParent() {
        return parent != null;
    }

    @Override
    public BinaryTreePosition getParent() {
        return parent;
    }

    @Override
    public void setParent(BinaryTreePosition p) {
        parent = p;
    }


    @Override
    public boolean isLeaf() {
        return !hasLChild() && !hasRChild();
    }

    @Override
    public boolean isLChild() {
        return (hasParent() && this == getParent().getLChild());
    }

    @Override
    public boolean hasLChild() {
        return lChild != null;
    }

    @Override
    public BinaryTreePosition getLChild() {
        return lChild;
    }

    @Override
    public void setLChild(BinaryTreePosition c) {
        lChild = c;
    }

    @Override
    public boolean isRChild() {
        return (hasRChild() && this == getParent().getRChild());
    }

    @Override
    public boolean hasRChild() {
        return rChild != null;
    }

    @Override
    public BinaryTreePosition getRChild() {
        return rChild;
    }

    @Override
    public void setRChild(BinaryTreePosition c) {
        rChild = c;
    }

    @Override
    public BinaryTree getRoot() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void updateSize() {
        size = 1;
        if (hasLChild()) {
            size += getLChild().getSize();
        }

        if (hasRChild()) {
            size += getRChild().getSize();
        }

        if (hasParent()) {
            getParent().updateSize();
        }
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void updateHeight() {
        height = 0;
        if (hasLChild()) {
            height = Math.max(height, 1 + getLChild().getHeight()); // Left
        }

        if (hasRChild()) {
            height = Math.max(height, 1 + getRChild().getHeight());
        }

        if (hasParent()) {
            getParent().updateHeight();
        }
    }

    @Override
    public int getDepth() {
        return depth;
    }

    @Override
    public void updateDepth() {
        depth = hasParent() ? 1 + getParent().getDepth() : 0;

        if (hasLChild()) {
            getLChild().updateDepth();
        }

        if (hasRChild()) {
            getRChild().updateDepth();
        }
    }

    @Override
    public BinaryTreePosition getPrev() {
        if (hasLChild()) {
            return findMaxDescendant(getLChild());
        }

        if (isRChild()) {
            return getParent();
        }

        BinaryTreePosition v = this;

        while (v.isLChild()) {
            v = v.getParent();
        }

        return v.getParent();
    }

    @Override
    public BinaryTreePosition getSucc() {
        if (hasRChild()) {
            return findMinDescendant(getRChild());
        }

        if (isLChild()) {
            return getParent();
        }

        BinaryTreePosition v = this;

        while (v.isRChild()) {
            v = v.getParent();
        }
        return v.getParent();
    }

    @Override
    public BinaryTreePosition secede() {
        if (parent != null) {
            if (isLChild()) {
                parent.setLChild(null);
            } else {
                parent.setRChild(null);
            }

            parent.updateSize();
            parent.updateHeight();

            parent = null;

            updateDepth();
        }
        return this;
    }

    @Override
    public BinaryTreePosition attachL(BinaryTreePosition c) {
        if (hasLChild()) {
            getLChild().secede();
        }

        if (c != null) {
            c.secede();
            lChild = c;
            c.setParent(this);

            updateSize();
            updateHeight();

            c.updateDepth();
        }
        return this;
    }

    @Override
    public BinaryTreePosition attachR(BinaryTreePosition c) {
        if (hasRChild()) {
            getRChild().secede();
        }

        if (c != null) {

            c.secede();

            rChild = c;
            c.setParent(this);

            updateSize();
            updateHeight();

            c.updateDepth();

        }

        return this;
    }

    @Override
    public Iterator elementsPreOrder() {

        /*
        List list = new TreeLinkedList();

        elementsPreOrder(list, this);

        return list.elements();

         */
        return null;
    }

    @Override
    public Iterator elementsInOrder() {
        return null;
    }

    @Override
    public Iterator elementsPostOrder() {
        return null;
    }

    @Override
    public Iterator elementsLevelOrder() {
        return null;
    }


    // Helper Method;
    protected static BinaryTreePosition findMinDescendant(BinaryTreePosition v) {
        return null;
    }


    // Helper Method;
    protected static BinaryTreePosition findMaxDescendant(BinaryTreePosition v) {
        return null;
    }
}
