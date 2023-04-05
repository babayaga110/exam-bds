import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("Enter Size of the array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter Values");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Here is the array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
