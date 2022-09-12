package oops.Inheritence;

public class Coder extends Person{

    Coder(String name){
        this.name=name;
    }
    // Method Overriding
    
    public void walk(){
        System.out.println("coder "+name+ " is walking");
        super.walk();
    }
}
