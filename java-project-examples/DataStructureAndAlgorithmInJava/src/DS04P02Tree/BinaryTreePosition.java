package DS04P02Tree;

import java.util.Iterator;

/**
 * Book - 123P;  PDF - 135P;
 */


public interface BinaryTreePosition extends BinaryTree {

    public boolean hasParent();

    public BinaryTreePosition getParent();

    public void setParent(BinaryTreePosition p);

    public boolean isLeaf();

    // Left-Child;
    public boolean isLChild();

    public boolean hasLChild();

    public BinaryTreePosition getLChild();

    public void setLChild(BinaryTreePosition c);


    // Right-Child;
    public boolean isRChild();

    public boolean hasRChild();

    public BinaryTreePosition getRChild();

    public void setRChild(BinaryTreePosition c);

    // Size;
    public int getSize();

    public void updateSize();

    // Height;
    public int getHeight();

    public void updateHeight();


    // Depth;
    public int getDepth();

    public void updateDepth();


    public BinaryTreePosition getPrev();

    public BinaryTreePosition getSucc();

    // 断绝当前节点和父节点的关系；
    // 返回当前节点；
    public BinaryTreePosition secede();

    // Set
    public BinaryTreePosition attachL(BinaryTreePosition c);

    public BinaryTreePosition attachR(BinaryTreePosition c);


    // Traver;
    public Iterator elementsPreOrder();

    public Iterator elementsInOrder();

    public Iterator elementsPostOrder();

    public Iterator elementsLevelOrder();
}
