package oops;


class Vehicle{
    int wheels;
    int Steering;
    int headlights;
    String color;
    Vehicle(int wheel,int headlights){
        wheels=wheel;
        Steering=1;
        this.headlights=headlights;
    }
    // Constructor Overloading
    Vehicle(int wheels,int headlights, String color){
        this.wheels=wheels;
        this.color=color;
        this.headlights=headlights;
    }
}

public class MyConstructor {
    MyConstructor(){
        System.out.println("hello world");
    }
    public static void main(String[] args) {
        // MyConstructor obj=new MyConstructor();   

        Vehicle car=new Vehicle(5,2);
        System.out.println(car.wheels);
        System.out.println(car.Steering);

        Vehicle mustang=new Vehicle(4, 6,"yellow");
        System.out.println(mustang.color);
    }
}
