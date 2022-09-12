package oops;


public class Methods {
    public static void main(String[] args) {
        int result=Greater(16,13,28);
        System.out.println(result);
    }
    static int Greater(int a,int b){
        int c=a>b?a:b;
        return c;
    }

    // Method Overloading

    static int Greater(int a,int b,int c){
        if(a>b){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }
        else if(b>c){
            return b;
        }
        else{
            return c;
        }
    }
}
