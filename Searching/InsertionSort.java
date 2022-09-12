package Searching;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int a[]={50,40,30,20,10};
System.out.println(Arrays.toString(a));


 
for (int i = 1; i < a.length; i++) {
    


    int temp=a[i];
int j=i-1;
while(j>=0 && a[j]>temp){
a[j+1]=a[j];
j--;
}
a[j+1]=temp; 


     
}











System.out.println("aAfter sort");
System.out.println(Arrays.toString(a));




    }
    
}
