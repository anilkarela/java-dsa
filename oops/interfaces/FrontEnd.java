package oops.interfaces;

public abstract interface FrontEnd {
    public void frontend();

    default public void BackEnd(){
        System.out.println("Coder is working on BackEnd");
    }
}
