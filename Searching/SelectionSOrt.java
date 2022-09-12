package Searching;

import java.util.Arrays;

public class SelectionSOrt {
    public static void main(String[] args) {
                                                               
int a[]={50,40,30,20,10};
System.out.println(Arrays.toString(a));

for (int i = 0; i < a.length-1; i++) {
    int min=i;

    //loop for finding min elemnet
    for (int j = i+1; j < a.length; j++) {
     if(a[min]>a[j]){
        min=j;
     }   
    }

    // after the above we swap
    int temp=a[i];
    a[i]=a[min];
    a[min]=temp;

}
System.out.println("aAfter sort");
System.out.println(Arrays.toString(a));
    }
    
}
