package sets;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Set<String> st = new HashSet<>();  // stores elements in random order
        st.add("apple");
        st.add("orange");
        st.add("banana");
        System.out.println(st);

        Set<Integer> lSet=new LinkedHashSet<>(); // stores elements in order
        lSet.add(45);
        lSet.add(44);
        lSet.add(43);
        System.out.println(lSet);

        Set<Integer> tSet= new TreeSet<>(lSet); // stores elements in sorted order 
        System.out.println(tSet);

        Set<Integer> hSet1=new HashSet<>(); // stores elements in order
        hSet1.add(45);
        hSet1.add(12);
        hSet1.add(43);
        
        Set<Integer> hSet2=new HashSet<>(); // stores elements in order
        hSet2.add(45);
        System.out.println(lSet);

        System.out.println(hSet1.containsAll(hSet2));  // hSet2 is subset of hSet1
        System.out.println(hSet1.containsAll(lSet));
        System.out.println(hSet1.containsAll(tSet));


        lSet.retainAll(hSet1);  // Intersection
        System.out.println(lSet);

        lSet.addAll(hSet1); //  Union
        System.out.println(lSet);
        
        HashSet<String> str= new HashSet<>();
        String st1= "abccba";
        str.add("abdfssa");
        
    }
}
