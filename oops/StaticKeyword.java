package oops;


public class StaticKeyword {

    static{
        System.out.println("in block 1");
    }

    static{
        System.out.println("in block 2");
    }

    public static void main(String[] args) {

        A obja = new A();
        A.B objb = obja.new B(); 
        objb.object();

        A.C objc = new A.C();
        System.out.println(objc.getClass());
    }
    static{
        System.out.println("in block 3");
    }
}
