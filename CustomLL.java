package com.bridgelabz.main.linkedlist;

class Node{
	int data;
	Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
}

//@desc:custom linked list class that has all the functions
public class CustomLL {
   Node head=null;
/*
* @desc:add elements in linked list
* @params:Integer data
* @return:none
*/
 public void addFirst(int element) {
 Node newNode=new Node(element);
 if(head ==null) {
	   head=newNode;
 }
 else {
	   newNode.next=head;
	   head=newNode;
 }
 
}
 
 /*
 * @desc:FIND AN ELEMENT  in linked list
 * @params:none
 * @return:none
 */
  public int find(int ele) {
	   int pos=1;
	   Node curr=head;
	   while(curr.next != null) {
		   if(curr.data== ele) {
			   return pos;
		   }
		   curr=curr.next;
		   pos++;
	   }
	return 0;
   }

/*
* @desc:add elements in linked list
* @params:Integer data
* @return:none
*/
	public void addPos(int element,int pos) {
	 Node newNode=new Node(element);
	 if(head ==null) {
		   head=newNode;
	 }
	 else if(pos == 1) {
		 head.next=newNode;
	 }
	 else {
		 Node curr=head;
		 for(int i=1;i<pos-1 && curr.next != null;i++) {
			 curr=curr.next;
		 }
		 newNode.next=curr.next;
		 curr.next=newNode;
	 }
  }
   
   
  /*
  * @desc:display the elements of the LL
  * @params:none
  * @return:none
  */
 public  void display() {
	   Node curr=head;
	   while(curr.next != null) {
		   System.out.print(curr.data+" --> ");
		   curr=curr.next;
	   }
	   System.out.println(curr.data);
   }
}


 
