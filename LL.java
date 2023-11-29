package com.bridgelabz.main.linkedlist;
//@desc:main class
public class LL {


	public static void main(String []args) {
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
