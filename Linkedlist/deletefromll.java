package linkedlist;

public class deletefromll {
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
	    
	    //delete from start
	    
	    public void deletefirst() {
	    	if(head==null) {
	    		System.out.println("list is empty");
	    	return;
	    	}
	    	head=head.next;
	    }

	    
	    
	    //delete from end
	    
	    public void deletelast() {
	    	if(head==null) {
	    		System.out.println("list is empty");
	    	return;
	    	}
	    	if(head.next==null) {
	    		head=null;
	    		return;
	    	}
	   Node secondlast=head;
	   Node lastnode=head.next;
	    while(lastnode.next!=null) {
	    	lastnode=lastnode.next;
	    	secondlast=secondlast.next;
	    }
	    secondlast.next=null;
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
	        list.deletefirst();
	        list.deletelast();
	    }
	}
