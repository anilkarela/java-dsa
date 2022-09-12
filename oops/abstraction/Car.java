package oops.abstraction;

public abstract class Car {
    public abstract void accelerate();  // abstract method
    public abstract void breaking();

    public void honk(){
        System.out.println("car is honking"); // concreate method or non-abstract method
    }
}
