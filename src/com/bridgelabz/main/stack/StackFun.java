package com.bridgelabz.main.stack;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}

class StackFun{
	Node head;
	StackFun(){
		head=null;
	}
	
//UC 1
	void push(int ele) {
		Node newNode =new Node(ele);
		if(head ==null) {
			head=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	
	
//UC 2
	void pop() {
	   if(head==null) {
		   System.out.println("Empty");
	   }
	   else {
		   System.out.println(head.data+" is popped");
           head=head.next;
	   }
	}
	
	void peek() {
		   if(head==null) {
			   System.out.println("Empty");
		   }
		   else {
	           System.out.println("top element="+head.data);
		   }
		}
	   void display() {
		   Node curr=head;
		   while(curr.next != null) {
			   System.out.print(curr.data+" --> ");
			   curr=curr.next;
		   }
		   System.out.println(curr.data);
	   }

}
