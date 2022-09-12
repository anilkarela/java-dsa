package Searching;

import java.util.*;

public class MergeSOrtAlgo {

    static void merge(int a[], int s, int mid, int e) {

        int len1 = mid - s + 1;
        int len2 = e - mid;
        int arr1[] = new int[len1];
        int arr2[] = new int[len2];
        int mainindex = s;

        for (int i = 0; i < len1; i++) {
            arr1[i] = a[mainindex++];

        }
        mainindex = mid + 1;

        for (int i = 0; i < len2; i++) {
            arr2[i] = a[mainindex++];

        }
        
        // merge them
        int idx1 = 0, idx2 = 0;

        mainindex = s;
        while (idx1 < len1 && idx2 < len2) {
            if (arr1[idx1] < arr2[idx2]) {
                a[mainindex++] = arr1[idx1++];
            } else {
                a[mainindex++] = arr2[idx2++];
            }
        }
        while (idx1 < len1) {
            a[mainindex++] = arr1[idx1++];
        }
        while (idx2 < len2) {
            a[mainindex++] = arr2[idx2++];
        }
    }
    static void mergeSort(int a[], int s, int e) {
if(s>=e){
    return;
}
     
        int mid = s + (e - s) / 2;

        mergeSort(a, s, mid);
        mergeSort(a, mid + 1, e);
        merge(a, s, mid, e);
    

    }

    public static void main(String[] args) {
        int a[] = { 50, 40, 20, 10 , 30};
        System.out.println(Arrays.toString(a));
        int s = 0;
        int e = a.length - 1;
        mergeSort(a, s, e);

       for (int i = 0; i < a.length; i++) {
         System.out.print(a[i]+" ");
       }
    }
}
