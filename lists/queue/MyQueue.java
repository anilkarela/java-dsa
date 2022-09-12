package lists.queue;

public class MyQueue<E> {
    private  Node<E> rear = null, front = null;
    

    static class Node<E>{
        E data;
        Node<E> next;

        public Node(E data){
            this.data=data;
            next = null;
        }
    }
    public void enqueue(E item)     // insertion at the end
    {
        Node<E> node = new Node<E>(item);
        System.out.printf("Inserting %d\n", item);

        if (front == null)
        {
            front = node;
            rear = node;
        }
        else {
            rear.next = node;
            rear = node;
        }
    }
    public E dequeue(){
        if(front==null){
            System.out.println("removing from empty queue");
            System.exit(-1);
        }
        Node<E> temp=front;
        front=front.next;
        if(front ==null){
            rear=null;
        }
        return temp.data;
    }
    public E peek()
    {
        // check for an empty queue
        if (front == null) {
            System.exit(-1);
        }
 
        return front.data;
    }
}
