package lists.deque;
import java.util.ArrayDeque;

public class MainClass {
    public static void main(String[] args) throws Exception {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(5);
        // ad.addFirst(45);  
        // ArrayDeque<Integer> temp=ad.clone();
        // System.out.println(ad.pop());
        // System.out.println(temp);
        
        MyDeque<Integer> myDeque = new MyDeque<>();
        myDeque.addFirst(11);
        myDeque.addFirst(24);
        myDeque.addFirst(31);
        myDeque.addFirst(44);
        myDeque.addFirst(51);
        myDeque.addFirst(64);
        myDeque.removeLast();
        myDeque.print();

    }
}
