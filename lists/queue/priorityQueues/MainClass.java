package lists.queue.priorityQueues;
import java.util.PriorityQueue;

public class MainClass {
    public static void main(String[] args) {
        PriorityQueue<String> pq= new PriorityQueue<String>();
        pq.add("apple");
        pq.add("table");
        pq.add("pen");        
        pq.add("arguments");        
        pq.add("books");        
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());


    }
}
