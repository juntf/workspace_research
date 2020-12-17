package DS04P02Tree;

import DS02P03LinkedList.Position;
import DS03P02List.List;

import java.util.Iterator;


public class IteratorTree implements Iterator {
    private List list;
    private Position nextPosition;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    public IteratorTree() { list = null;}

    // 前序遍历
    public void elementsPreorderIterator(TreeLinkedList T) {
        if(T == null) return ;
        list.insertLast(T);
        TreeLinkedList subTree = T.getFirstChild();
        while(null != subTree) {
            this.elementsPreorderIterator(subTree);

            subTree = subTree.getNextSibling();
        }
    }

    public void elementsPostorderIterator(TreeLinkedList T) {
        if( null == T) return ;
        TreeLinkedList subTree = T.getFirstChild();
        while(null != subTree) {
            this.elementsPostorderIterator(subTree);
            subTree = subTree.getNextSibling();
        }
        list.insertLast(T);
    }
}
