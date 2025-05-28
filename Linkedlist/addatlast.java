package linkedlist;

public class addatlast {
public static class Node{
	int data;
	Node next;

	}
public static class ll {
	Node head;
	Node tail;
	int size;
void atlast(int val) {
	if(size==0) {
		Node a=new Node();
		a.data=val;
		a.next=null;
		head=tail=a;
		size++;
	}
}

}
}
