package oops.interfaces;

public class Person implements Student,Coder {
    public static void main(String[] args) {
        Person p = new Person();
        p.coding();
        p.study();
        p.frontend();

        Coder c2 =p;

        c2.coding();
        p.BackEnd();
    }
    public void study(){
        System.out.println("person is studying");
    }
    public void coding(){
        System.out.println("person is coding");
    }
    public void frontend(){
        System.out.println("coder is working on frontend");
    }
}
