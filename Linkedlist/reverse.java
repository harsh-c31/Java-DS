package linkedlist;

public class reverse {
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

    // Delete from start
    public void deletefirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Delete from end
    public void deletelast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastnode = head.next;
        while (lastnode.next != null) {
            secondlast = lastnode;
            lastnode = lastnode.next;
        }
        secondlast.next = null;
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

    // Reverse the list iteratively
    public void reverseiterate() {
        if (head == null || head.next == null) {
            return; // Nothing to reverse
        }
        Node prevNode = null;
        Node currNode = head;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }

    // Main method
    public static void main(String[] args) {
        reverse list = new reverse();

        // Adding nodes to the list
        list.addAtFirst("a");
        list.addAtLast("b");
        list.addAtLast("d");

        // Printing the list
        System.out.println("Original List:");
        list.printList();

        // Delete two nodes from the start
        System.out.println("After deleting first node:");
        list.deletefirst();
        list.printList();

        System.out.println("After deleting another first node:");
        list.deletefirst();
        list.printList();

        // Add a few more nodes and reverse the list
        list.addAtLast("e");
        list.addAtLast("f");
        System.out.println("Before reversal:");
        list.printList();

        list.reverseiterate();
        System.out.println("After reversal:");
        list.printList();
    }
}
