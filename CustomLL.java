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
 * @desc:DEL FIRST elements in linked list
 * @params:none
 * @return:none
 */
public  void delFirst() {
 if(head == null) {
	   System.out.println("Empty");
 }
 else {
	   head=head.next;
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


 
