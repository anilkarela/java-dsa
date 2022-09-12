package Questions;

import java.util.*;

public class ZeroSumSubArray {
    public static void main(String[] args) {
        int arr[]= {-4,1,3,2,2};
        boolean found = false;
        
        // for(int i=0;i<arr.length;i++){
        //     int sum=0;
        //     for(int j=i;j<arr.length;j++){
        //         sum+=arr[j];
        //         if(sum==0){
        //             found=true;
        //             break;
        //         }
        //         if(found) break;
        //     }
        // }

        Set<Integer> st= new HashSet<>();
        int sum=0;
        for(int e:arr){
            st.add(sum);
            sum+=e;
            if(st.contains(sum)){
                found=true;
                break;
            }
            System.out.println(1);
        }
        
        System.out.println(found);
    }
}
