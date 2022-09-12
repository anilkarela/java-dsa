package Searching;

public class BinarySearch {

    static int binary(int []a,int target){
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a[mid]==target){
                return mid;
            }
            else if(a[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
          int a[]={10,20,30,40,50};
          int index=binary(a,50);
          if(index!=-1){
            System.out.println(index);
          }
          else{
            System.out.println("not");
          }

    }
    
}
