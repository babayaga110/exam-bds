import java.util.*;
import java.util.Stack;

//Stack implementation without class
public class stack {
    private int arr[];
    private int top;
    private int capacity;

    //creating a stack
    stack(int size) {
        arr = new int[size];
        capacity = size;
        top = top - 1;
    }

    // return size of the stack
    public int getSize() {
        return top + 1;
    }

    //function to check if stack is full
    public boolean isfull() {
        return top == capacity - 1;
    }

    //function to check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    //add an element x to stack
    public void push(int x) {
        if (isfull()) {
            System.out.println("Stack is full");
        }
        System.out.println("Inserting element" + x);
        arr[++top] = x;
    }

    //fucntion to pop an element
    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            System.exit(1);
        }
        return arr[top--];
    }

    // display elements of stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the size of stack");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        stack stc = new stack(size);
        for (int i = 0; i < size; i++) {
            stc.push(i);
        }
        System.out.print("Stack: ");
        stc.printStack();
        // remove element from stack
//        stc.pop();
//        System.out.println("\nAfter popping out");
//        stc.printStack();

    }
}




//Implement stack using Stack class

//import java.util.Stack;
//
//public class stack{
//    public static void main(String[] args) {
//        Stack<Integer> stc=new Stack<>();
//        stc.push(1);
//        stc.push(2);
//        stc.push(3);
//
//       int x= stc.pop();
//        System.out.println("poped is"+x);
//
//    }
//}