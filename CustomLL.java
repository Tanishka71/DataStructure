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
* @desc:DEL elements in linked list
* @params:Integer data
* @return:none
*/
public void delPos(int pos) {
	if(head == null) {
		System.out.println("empty");
	}
	else if(pos ==1) {
		head=head.next;
	}
	else {
		Node curr=head;
		Node prev=curr;
		for(int i=1;i<pos && curr.next!=null;i++) {
			prev=curr;
			curr=curr.next;
		}
		prev.next=curr.next;
	}
}

/*
* @desc:DEL elements in linked list
* @params:Integer data
* @return:none
*/
Vvoid int size() {
	int count=1;
	Node curr=head;
	while(curr.next != null) {
		count++;
		curr=curr.next;
	}
	return count;
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


 
