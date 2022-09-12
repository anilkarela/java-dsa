package lists.deque;

public class MyDeque<E>{
    Node<E> head,tail;

    public void print() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void addFirst(E data){
        Node<E> addNode = new Node<E>(data);
        if(head==null){
            head=tail=addNode;
            return;
        }
        head.next=addNode;
        addNode.prev=head;
        head=addNode;
    }
    public E removeLast() throws Exception{
        if(head==null){
            throw new Exception("removing from empty ArrayDeque is not allowed");
        }
        Node<E> toRemove = tail;
        tail=tail.next;
        tail.prev=null;
        if(tail==null){
            head=null;
        }
        return toRemove.data;
        
    }

    public static class Node<E>{
        Node<E> prev,next;
        E data;

        public Node(E data){
            this.data=data;
            next=prev=null;
            
        }
    }
}
