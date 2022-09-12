package strings;

public class StringInro {
    public static void main(String[] args) {
        String name="anil";
        System.out.println(name);

        String cars="Maruti,Tata,Hyundai,Wagonar,Bmw,Mercedez";

        System.out.println(cars.indexOf('T'));

        String allcars[]=cars.split(",");
        for(String e:allcars){
            System.out.println(e);
        }

        String name1="    ANil     ";
        System.out.println(name1.trim());
    }
}
