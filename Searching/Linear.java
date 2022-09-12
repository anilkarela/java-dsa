package Searching;


public class Linear {

    //works on both sorted and unsorted array. dont need monotonic functions
    // o(n)
   
public static void main(String[] args) {
    

    int a[]={89,56,54,34,23,78};
    int target=34;
    int index=linearSearch(a,target);
if(index!=-1){
    System.out.println("ELmenet found at loc "+ index);
}
else{
    System.out.println("NOt found");
}

}
    static int linearSearch(int []a,int key){
   for(int i=0;i<a.length;i++){

if(a[i]==key){
    return i;
}
   }
   return -1;
    }
}
