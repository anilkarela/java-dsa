package maps;
import java.util.*;
import java.util.Map.Entry;
public class MainClass {
    public static void main(String[] args) {
        Map<String, Integer> mp= new HashMap<>();
        mp.put("anil",21);
        mp.put("avni",22);
        mp.put("champ",23);
        mp.put("anil",19);
        mp.putIfAbsent("champ",20);
        System.out.println(mp);
        System.out.println(mp.get("avni"));
        System.out.println(mp.getOrDefault("shree",0));
        System.out.println(mp.getOrDefault("champ",0));
        System.out.println(mp.containsKey("shree"));
        System.out.println(mp.containsValue(23));
        System.out.println(mp.replace("anil", 21));
        System.out.println(mp.replace("avni",22,30)); // key , oldVlaue , newValue --> replaces only if old value is right
        mp.remove("champ");
        mp.remove("anil",10); // wil only remove if value is right corrosping to key
        System.out.println(mp);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());

        Set<Entry<String, Integer>> entries = mp.entrySet();
        for(Entry<String, Integer> entry: entries /* or-> mp.entrySet()) */ ){
            entry.setValue(entry.getValue() *100);
        }
        mp.put("akk", 1);
        mp.put("two",2);
        mp.put("three",3);
        mp.put("four",4);
        mp.put("five",5);
        System.out.println(mp);

        Map<String,Integer> tMap= new TreeMap<>(mp);         // sorts the map
        Map<String,Integer> lMap= new LinkedHashMap<>(mp);   // remembers order
        System.out.println(tMap);
        System.out.println(lMap);

    }
}
