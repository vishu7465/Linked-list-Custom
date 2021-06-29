package linkedlist;

public class mylinkedlist {

	static node head;


void add(int data) {
	
	node toadd=new node(data);

	if(head ==null) {
		head=toadd;
		return;
	}
	node temp=head;
	while(temp.next !=null) {
		temp=temp.next;
	}
	temp.next=toadd;
}
 void print() {
	node temp=head;
	while(temp.next !=null) {
		System.out.println(temp.data +"");
		temp=temp.next;
	}
}


	static class node{
		int data;
		node next;
	
		public node(int data) {
			this.data=data;
			next=null;
		
		}
		
	}
}
