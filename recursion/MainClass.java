package recursion;

public class MainClass {
    static int stpeCount=0;
    public static void main(String[] args) {
        
        // int s=sum(5);
        // System.out.println(s);
        // int p=pow(2, 3);
        // System.out.println(p);

        // int pw=pow(3, 10000);
        // System.out.println(pw);
        // System.out.println("steps "+ stpeCount);

        // stpeCount=0;
        // int fp=fastpow(3, 10000);
        // System.out.println(fp);
        // System.out.println("steps "+ stpeCount);


        System.out.println(path(4, 4));

    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }
    static int pow(int a,int b){
        stpeCount++;
        if (b==0){
            return 1;
        }
        else{
            return a*pow(a,b-1);
        }
    }
    static int fastpow(int a,int b){
        stpeCount++;
        System.out.println(b);
        if(b==0) return 1;
        if(b%2==0) return fastpow(a*a, b/2);
        else return a*fastpow(a, b-1);
    }

    static int path(int n, int m){
        if(n==1 || m==1) {
            return 1;
        }
        else{
            return path(n-1,m) + path(m-1,n);
        }
    }
}
