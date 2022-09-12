package strings;

public class Reverse {
    public static void main(String[] args) {
        String str="   i need coffe, rn   ";
        String ans="";
        int i=str.length()-1;
        while(i>=0){
            while (i>=0 && str.charAt(i)==' '){
                i--;
            }
            int j=i;
            if(i<0) break;
            while(i>=0 && str.charAt(i)!=' '){
                i--;
            }
            if(ans.isEmpty()){
                ans=ans.concat(str.substring(i+1, j+1));
            }
            else{
                ans=ans.concat(" "+str.substring(i+1, j+1));
            }
        }
        System.out.println(ans);
    }
}
