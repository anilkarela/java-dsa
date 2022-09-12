package oops.polymorphism;


public class MainClass {
    public static void main(String[] args) {
        Dog d = new Dog();

        Pet p = d;
        Animal a=d;

        d.walk();
        p.walk();

        greetings();
        greetings("hii");
        String name= "Browny";
        System.out.println(name);
        System.out.println(d.name);  // variables does not override only methods do
        System.out.println(p.name);
        
    }public static void greetings(){
        System.out.println("HEllo");
    }
    public static void greetings(String s){
        System.out.println(s);
    }

}
