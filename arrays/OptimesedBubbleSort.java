package arrays;

public class OptimesedBubbleSort {
    public static void main(String[] args) {
        int a[]={5,4,6,1};
        int n=a.length;

        int count=1;
        boolean sorted=true;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if (a[j+1]<a[j]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;

                    sorted=false;
                    System.out.println(count);
                    count+=1;
                }
            }
            if (sorted) break;
        }
        for(int item:a){
            System.out.print(item + " ");
        }
    }
}
