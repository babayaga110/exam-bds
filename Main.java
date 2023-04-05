import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Set<String> set = new HashSet<>();
        System.out.println("How many elements you want:");
        int n = scn.nextInt();
        scn.nextLine();
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < n; i++) {
            set.add(scn.nextLine());
        }
        for(String i : set){
            System.out.println(i);
        }
        System.out.println(set);
    }
}