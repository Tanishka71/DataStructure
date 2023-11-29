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
         linkedlist.delPos(pos);
         linkedlist.size();
}
}
