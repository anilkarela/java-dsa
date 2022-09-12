package Questions;

import java.util.Scanner;

public class Que {

    public static int countcandles(int a, int b, int k) {
        if (a == b) {
            return 0;
        }
        int c1 = (b - a) - 1;
        int c2 = (k - b) + (a - 1);
        if (c1 == c2) {
            return 0;
        }
        return Math.min(c1, c2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(countcandles(a, b, k));
        sc.close();

    }
}