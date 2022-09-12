package Patterns;

public class Pattern {
    public static void pattern1(int n){          
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int row=1;row<=2*n-1;row++){
            if(row<=n){
                for(int col=1;col<=row;col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int col=2*n-row;col>=1;col--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    public static void pattern28(int n){
        for(int row=1;row<2*n;row++){
            int totalColsInRow = row>n?2*n-row:row; 
            int noOfSpaces = n-totalColsInRow;
            for(int space=0;space<noOfSpaces;space++){
                System.out.print(" ");
            }
            for(int col=0;col<totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern30(int n){
        for(int row=1;row<=n;row++){
            int noOfSpaces=n-row;
            
            for(int space=0;space<noOfSpaces;space++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern17(int n){
        for(int row=1;row<2*n;row++){
            int totalColsInRow=row>n?2*n-row:row;
            int noOfSpaces=n-totalColsInRow;
            for (int space = 0; space < noOfSpaces; space++) {
                System.out.print(" ");
            }
            for (int col = totalColsInRow; col >=1 ; col--) {
                System.out.print(col);
            }
            for(int col=2;col<=totalColsInRow;col++){
                System.out.print(col);
            }

            System.out.println();
        }
    }
    public static void pattern32(int n){
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int atEveryIndex=Math.min(Math.min(row, col),Math.min(n-row, n-col));
                System.out.print(atEveryIndex +" ");
            }
            System.out.println();
        }
    }
    
    public static void pattern31(int n){
        int originalN=n;
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int atEveryIndex=originalN - Math.min(Math.min(row, col),Math.min(n-row, n-col));
                System.out.print(atEveryIndex +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern31(5);
    }
}
