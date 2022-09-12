package oops;

class Cat{
    boolean hasFur;
    String breed;
    int eyes,legs;

    public void walk(){
        System.out.println("cat is walking");
    }
    public void eat(){
        System.out.println("cat is eating");
    }
    public void discription(){
        System.out.println("my cat has "+ legs +"legs, "+ eyes + " eyes");
    }

}
class Dog{

}

public class MainClass {
    public static void main(String[] args) {
        Cat chintu=new Cat();
        Cat cat1=new Cat();
        chintu.eyes=2;
        chintu.legs=4;
        chintu.breed="not Known";
        chintu.walk();
        cat1.eat();
        chintu.discription();
        cat1.discription();
        
    }
}
