package oops.encapsulation;


public class Student {
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String setName(String name){
        this.name=name;
        return name;
    }

    public void setAge(int age){
        if(age<18){
            System.out.println("you can note vote");
        }
        else{
            this.age=age;
        }
    }
}
