import java.util.HashSet;

public class Hashset{
    public static void main(String[] args) {
        HashSet<Integer> numbers =new HashSet<>();

        //using add method
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("HashSet: " + numbers);

        HashSet<Integer> numbers2 = new HashSet<>();

        // Using addAll() method and copy from one to other set
        numbers2.addAll(numbers);
        numbers2.add(5);
        System.out.println("New HashSet: " + numbers2);
    }

}
