
//Implement using without list clas
import java.util.LinkedList;
public class linkedList{

    //Represent a node of the singly linked lis

     class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    Node head=null;
    Node tail=null;

    //addNode() will add a new node to the list

    public void addNode(int data)
    {
        Node newNode = new Node(data);
        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedList lst =new linkedList();
        //Add nodes to the list
        lst.addNode(1);
        lst.addNode(2);
        lst.addNode(3);
        lst.addNode(4);
        //Displays the nodes present in the list
        lst.display();

    }
}












































































































// Implement list using class

//public class linkedList {
//    public static void main(String[] args) {
//        LinkedList<String > list =new LinkedList<>();
//
//        // Add elements to LinkedList
//        list.add("Dog");
//
//        // add element at the beginning of linked list
//        list.addFirst("Cat");
//
//        // add element at the end of linked list
//        list.addLast("Horse");
//        System.out.println("LinkedList: " + list);
//
//        // access first element
//        System.out.println("First Element: " + list.getFirst());
//
//        // access last element
//        System.out.println("Last Element: " + list.getLast());
//    }
//}
