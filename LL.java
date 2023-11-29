package com.bridgelabz.main.linkedlist;
//@desc:main class
public class LL {

	public static void main(String []args) {
		CustomLL linkedList=new CustomLL();
	     linkedList.addFirst(70);
	     linkedList.addFirst(30);
	     linkedList.addFirst(56);
         int pos=linkedList.find(30);
         System.out.println("it is present at: "+pos);
		linkedList.addPos(40,pos+1);
}
}
