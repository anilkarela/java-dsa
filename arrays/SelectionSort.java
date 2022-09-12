package arrays;

public class SelectionSort {
    public static void main(String[] args){
        int a[]={5,3,-1,0,6,2,1};
        int n=a.length;
        int count=1;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<n;j++){
               if(a[j]<a[min]){
                min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
            System.out.println(count);
            count+=1;
        }
        for(int item: a){
            System.out.print(item + " ");
        }
    }
}
