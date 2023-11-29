package com.bridgelabz.main.queue;


class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}

 class Queueq{
	Node head;
	Node rear;
	 Queueq(){
		 head=null;
		 rear=null;
	 }
	 
//UC 1
	void enqueue(int ele) {
		Node newNode=new Node(ele);
		if(head==null && rear==null) {
			head=rear=newNode;
		}
		else {
			rear.next=newNode;
			rear=newNode;
		}
	}
	
//UC 2
	void dequeue() {
		if(head==null && rear==null) {
			System.out.println("EMPTY");
		}
		else if(head == rear) {
			System.out.println(head.data+" is popped");
			head=rear=null;
		}
		else {
			 System.out.println(head.data+" is popped");
			head=head.next;
		}
	}
	 void display() {
		 Node curr=head;
		 while(curr.next !=null) {
			 System.out.print(curr.data+" -->");
			 curr=curr.next;
		 }
		 System.out.println(curr.data);
	 }
}
