package lists.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainClass {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(45);
        q.add(44);
        q.add(12);
        System.out.println(q.poll());
        System.out.println(q.offer(45));

        System.out.println(q.remove());
        System.out.println(q.element());

        MyQueue<Integer> q1= new MyQueue<>();
        q1.enqueue(45);
        q1.enqueue(15);
        int res=q1.dequeue();
        System.out.println(res);
        // int result=q.peek();
        // System.out.println(result);
    }
}
