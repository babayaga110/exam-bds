import java.util.HashMap;
import java.util.*;

//The java.util.HashMap.entrySet() method in Java is used to create a set out of the same elements contained in the hash map

//The Map. Entry interface enables you to work with a map entry. The entrySet( ) method declared by the Map interface returns a Set containing the map entries. Each of these set elements is a Map
public class Mapdsa {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
