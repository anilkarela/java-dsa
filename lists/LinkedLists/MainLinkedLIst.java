package lists.LinkedLists;

// import java.util.LinkedList;

public class MainLinkedLIst {
    public static void main(String[] args) {
        // ArrayList<Integer> al= new ArrayList<>();
        // LinkedList<Integer> ll=new LinkedList<>();

        // getTimeDiff(al);
        // getTimeDiff(ll);

        // accessTimeDiff(al);
        // accessTimeDiff(ll);

        MyLinkedList<Integer> myLL=new MyLinkedList<>();
        myLL.add(25);
        myLL.add(21);
        myLL.add(13);
        MyLinkedList<String> myLinkedList= new MyLinkedList<String>();

        myLinkedList.add("anil");
        myLinkedList.add("kumar");
        myLinkedList.print();

        myLL.print();


        // MyLL myLL2=new MyLL();
        // myLL2.add(22);
        // myLL2.add(44);
        // myLL2.add(25);
        // myLL2.getPrint();

    }
    // static void getTimeDiff(List <Integer> list){
    //     long start = System.currentTimeMillis();
    //     for(int i=0;i<100000;i++){
    //         list.add(0,i);

    //     }
    //     long end =System.currentTimeMillis();
    //     System.out.println(list.getClass().getName()+" : " +(end-start));
    // }
    // static void accessTimeDiff(List<Integer> list){
    //     long start=System.currentTimeMillis();
    //     int n=list.size();
    //     list.get(n-1);
    //     list.set(n-1,10);
    //     long end = System.currentTimeMillis();
    //     System.out.println(list.getClass().getName()+" : " +(end-start));
    // }
    
}
