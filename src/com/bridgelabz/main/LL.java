package com.bridgelabz.main.linkedlist;
//@desc:main class
public class LL {

	public static void main(String []args) {
		CustomLL linkedList=new CustomLL();
		  linkedList.addFirst(70);
		  linkedList.addFirst(40);
		  linkedList.addFirst(40);
		  linkedList.addFirst(56);
	     int pos=linkedList.find(40);
	     linkedList.delPos(pos);
	     int size=linkedList.size();
	     linkedList.display();
	     System.out.println("size: "+size);
	     
	        SortedLinkedList<Integer> sortedList = new SortedLinkedList<>();
	        
	        // Adding elements in ascending order
	        sortedList.add(56);
	        sortedList.add(30);
	        sortedList.add(40);
	        sortedList.add(70);

	        // Displaying the final sequence
	        sortedList.display();
}

}
