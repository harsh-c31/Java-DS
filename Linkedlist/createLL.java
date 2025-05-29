package linkedlist;

public class createLL {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add at the start of the list
    public void addAtFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add at the end of the list
    public void addAtLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        createLL list = new createLL();

        // Adding nodes to the list
        list.addAtFirst("a");
        list.addAtLast("b");
        list.addAtLast("d");

        // Printing the list
        list.printList();
  
    }

}
