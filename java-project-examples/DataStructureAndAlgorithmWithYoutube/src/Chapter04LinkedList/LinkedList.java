package Chapter04LinkedList;

public class LinkedList {

    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    ListNode head;
    ListNode tail;
    int size = 0;
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insert(int position, int number) {
        if(position > size) {
            return ;
        }

        ListNode newNode = new ListNode(number);
        if(position == 0) {
            newNode.next = head;
            head = newNode;

            if(tail == null) {
                tail = newNode;
            }

            size++;
        } else if (position == size) {
            this.append(number);
        } else {
            ListNode prev = head;
            for(int i = 0; i < position -1; i++) {
                prev = prev.next;
            }

            ListNode next = prev.next;
            newNode.next = next;
            prev.next = newNode;
            size++;
        }
    }

    public void append(int number) {
        ListNode newNode = new ListNode(number);
        if(tail == null) {
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }


    public void delete(int number) {
        if(head != null && head.val == number) {
            head = head.next;
            size--;

            if(size == 0) {
                tail = head;
            }
        }
        else {
            ListNode prev = head;
            ListNode cur = head;

            while(prev != null && cur != null) {
                if(cur.val == number) {

                    if(cur == tail) {
                        tail = prev;
                    }

                    prev.next = cur.next;
                    size--;
                    return;
                }

                prev = cur;
                cur = cur.next;
            }

        }
    }

    public int search(int number) {
        ListNode cur = head;
        for(int index = 0; cur != null; index++) {
            if(cur.val == number) {
                return index;
            }

            cur = cur.next;
        }

        return -1;
    }

    public int update(int oldVal, int newVal) {
        ListNode cur = head;
        for(int index = 0; cur != null;  index++) {
            if(cur.val == oldVal) {
                cur.val = newVal;
                return index;
            }
            cur = cur.next;
        }

        return -1;
    }
}
