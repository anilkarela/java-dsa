package strings;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        int n=str.length();
        int m=str1.length();   
        boolean isAnagram=false;
        boolean visited[]=new boolean[m];

        if(n==m){
            for(int i=0;i<n;i++){
                char c=str.charAt(i);
                isAnagram=false;
                for(int j=0;j<m;j++){
                    if(str1.charAt(j)==c && !visited[j]) {
                        visited[j]=true;
                        isAnagram=true;
                        break;
                    }
                }
                if(!isAnagram){
                    break;
                }
            }
        }
        if(isAnagram){
            System.out.println("anagram");
        }
        else{System.out.println("not anagram");
    }
        sc.close();
    }
    
}
