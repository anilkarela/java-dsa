package strings;
import java.util.Scanner;


public class AnagramOptimised {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        boolean isAnagram=true;

        int al[]=new int[256];
        // int bl[]=new int[256];
        for(char c:str.toCharArray()){
            int index=(int) c;
            al[index]++;
        }
        // for (char d:str1.toCharArray()){
        //     int index=(int) d;
        //     bl[index]++;
        // }
        // for(int i=0;i<256;i++){
        //     if(al[i]!=bl[i]){
        //         isAnagram=false;
        //         break;
        //     }
        // }


        for (char d:str1.toCharArray()){
            int index=(int) d;
            al[index]--;
        }
        for(int i=0;i<256;i++){
            if(al[i]!=0){
                isAnagram=false;
            }
        }


        if(isAnagram){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }
        sc.close();

    }
}
