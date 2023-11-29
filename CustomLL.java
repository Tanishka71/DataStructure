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
 public void addLast(int element) {
 Node newNode=new Node(element);
 if(head ==null) {
	   head=newNode;
 }
 else {
	   Node curr=head;
	   while(curr.next != null) {
		   curr=curr.next;
	   }
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


 
