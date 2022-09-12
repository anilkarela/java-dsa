package oops.Inheritence;

import oops.packages.models.Teacher;

public class MainClass {
    public static void main(String[] args) {
        Techer t = new Techer();
        Singer s = new Singer();
        Coder c = new Coder("anil");
        t.name="natasha";
        t.eat();
        s.walk();
        s.sing();
        t.teach();
        c.eat();
        c.walk();

        Person p1= new Person();

        Coder c1=new Coder("allen");

        Person p= c1;

        Teacher t2=new Teacher();

        // Person p2= t2;

        // Teacher t1=(Teacher) t2;
        boolean y= t2 instanceof Teacher;

        System.out.println(y);


    }
}
