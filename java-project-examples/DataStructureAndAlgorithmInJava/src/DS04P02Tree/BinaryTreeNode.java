package DS04P02Tree;

import java.util.Iterator;

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

        if(null != p ) {
            if(asLChild) {
                p.attachL(this);
            }else {
                p.attachR(this);
            }
        }

        if(lChild != null) {
            attachL(lChild);
        }

        if(rChild != null) {
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
        return parent != null ;
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
        return ( hasParent() && this == getParent().getLChild() );
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
        return ( hasRChild() && this == getParent().getRChild() );
    }

    @Override
    public boolean hasRChild() {
        return rChild != null ;
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
        if(hasLChild()) {
            size += getLChild().getSize();
        }

        if(hasRChild()) {
            size += getRChild().getSize();
        }

        if(hasParent()) {
            getParent().updateSize();
        }
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void updateHeight() {

    }

    @Override
    public int getDepth() {
        return 0;
    }

    @Override
    public void updateDepth() {

    }

    @Override
    public BinaryTreePosition getPrev() {
        return null;
    }

    @Override
    public BinaryTreePosition getSucc() {
        return null;
    }

    @Override
    public BinaryTreePosition secede() {
        return null;
    }

    @Override
    public BinaryTreePosition attachL(BinaryTreePosition c) {
        return null;
    }

    @Override
    public BinaryTreePosition attachR(BinaryTreePosition c) {
        return null;
    }

    @Override
    public Iterator elementsPreOrder() {
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
}
