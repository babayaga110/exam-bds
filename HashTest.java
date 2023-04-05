import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner scn = new Scanner(System.in);
        System.out.println("How many elements you want:");
        int n = scn.nextInt();
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < n; i++) {
            map.put(scn.next(), scn.nextInt());
        }
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        System.out.println(map);
    }
}
