package DATA_STRUCTURE.LINKED_LIST;

public class LinkedList {
     // Node class
    static class Node {
        int data;
        Node next;                       //each node can only hold a node or null

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of list
    Node head = null;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);              //calls the constructor

        if (head == null) {
            head = newNode;                         //if the head is null that means the inserted data will be the head
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Print list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Delete by value
    public void delete(int value) {
        if (head == null) return;

        if (head.data == value) {       
            head = head.next;
            return;
        }

        //while our current.next node is not null and current.next.data is not equal to value
        //
        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

     
        
        list.printList(); // 10 -> 20 -> 30 -> null
        list.delete(20);
        list.printList(); // 10 -> 30 -> null
    }
}
