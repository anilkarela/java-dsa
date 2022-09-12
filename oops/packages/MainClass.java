package oops.packages;
import oops.packages.models.*;

public class MainClass {
    MainClass(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
    Student obj=new Student("Anil");
    System.out.println(obj.getName());

    // obj.name="Kumar";  //FIELD NOT VISIBLE BECAUSE ACCESS MODIEFIER IS PRIVATE IN STUDENT(STRING NAME)

    Teacher objTeacher = new Teacher();
    MainClass m=new MainClass();
    }
}
