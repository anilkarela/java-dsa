package lists.LinkedLists;
import java.util.ArrayList;
import java.util.List;

public class MYArrayList {
    public static void main(String[] args) {
        List<String> fruits= new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        
        List<String> vegtable= new ArrayList<>();
        vegtable.add("potato");
        vegtable.add("tomato");

        fruits.addAll(vegtable);

        System.out.println(fruits);


        List<String> toRemove=new ArrayList<>();
        toRemove.add("potato");
        toRemove.add("tomato");

        fruits.removeAll(toRemove);

        System.out.println(fruits);

        String temp[]= new String[fruits.size()];
        fruits.toArray(temp);

        for(String c:temp){
            System.out.println(c);
        }



        // Pair<String,Integer> p1 = new Pair<String,Integer>("anil", 21);
        // Pair<Boolean,Double> p2 = new Pair<>(true,22.0);

        // ArrayList<Integer> marks = new ArrayList<>();

        // p1.getDiscription();
        // p2.getDiscription();

        // marks.add(45);
        // marks.add(55);
        // System.out.println(marks.size());
        // System.out.println(marks.get(1));
        // System.out.println(marks.isEmpty());
    }
}
