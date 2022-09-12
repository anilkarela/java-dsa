package hello;

public class str {
    public static void main(String[] args) {
        String str= "anil";
        System.out.println(str.hashCode());
        StringBuilder sb= new StringBuilder();
        sb.append(str.substring(0,3));
        String res=sb.toString();
        System.out.println(res);
    }
}
