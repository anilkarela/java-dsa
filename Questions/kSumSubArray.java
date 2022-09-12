package Questions;

public class kSumSubArray {
    public static void main(String[] args) {
        int arr[]= {-4,1,3,2,2};
        int k=5;
        int res=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;i<arr.length;i++){
                sum+=arr[j];
                if(sum==k){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
