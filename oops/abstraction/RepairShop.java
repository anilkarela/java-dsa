package oops.abstraction;


public class RepairShop {
    public static void repairCar(WagonR car){ 
        System.out.println("car is reparing");
    }
    public static void repairCar(Audi car){
        System.out.println("car is reparing");
    }
    public static void main(String[] args) {
        WagonR wwR=new WagonR();
        Audi audi = new Audi();


        repairCar(wwR);
        repairCar(audi);

    }
}