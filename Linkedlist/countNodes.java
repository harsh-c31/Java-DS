class Main {

    static class Node {
        int data;
        Node next;
  Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static int countNodes(Node head) {
        int count = 0;
        Node curr = head;
 while (curr != null) {
            count++;
            curr = curr.next;
        }
   return count;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println("Total nodes: " + countNodes(head));
    }
}
