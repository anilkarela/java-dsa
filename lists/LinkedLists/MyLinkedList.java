package lists.LinkedLists;

public class MyLinkedList<E> {
    Node<E> head;

    public void add(E data) {
        Node<E> toAdd = new Node<E>(data);

        if (isEmpty()) {
            head = toAdd;
            return;
        }

        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public E removeLast() throws Exception {
        Node<E> temp = head;

        if (temp == null) {
            throw new Exception("cannot remove from empty LinkedList");
        }
        if (temp.next == null) {
            Node<E> toRemove = temp;
            head = null;
            return (E) toRemove.data;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node<E> toRemove = temp.next;
        temp.next = null;
        return (E) toRemove.data;
    }

    public E getLast() throws Exception {
        Node<E> temp = head;
        if (isEmpty()) {
            throw new Exception("list is empty");
        }

        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
            next = null;
        }
    }
}
