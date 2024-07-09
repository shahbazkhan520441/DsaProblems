package co.m.java.dsa.questions;


public class SLinkedList {
Node head;

class Node{
	Node next;
	Object data;
	Node(Object data){
		this.data=data;
	}
}
public  void add(Object data) {
	Node n=new Node(data);
	if(head==null) {
		head=n;
	}
	Node temp=head;
	while(temp.next!=null) {
		temp=temp.next;
	}
	temp.next=n;

}

public void display() {
	Node temp=head;
	while(temp!=null) {
	
		if(temp.data!=null) {
			System.out.println(temp.data);
			System.out.println("->");
			temp=temp.next;	
		}
		System.out.println();
		
	}
}

}
