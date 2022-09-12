package lists.queue;

import java.util.Scanner;

/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer(sc.next());
        String x = sc.next();

        System.out.println(str.indexOf(x));
        sc.close();
    }
    
}