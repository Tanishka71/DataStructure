package com.bridgelabz.linkedlist.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.main.linkedlist.CustomLL;
import com.bridgelabz.main.linkedlist.LL;

class LLtest {
    CustomLL obj=new CustomLL();

	@Test
	void testCase1() {
	    obj.addFirst(70);
	    obj.addFirst(30);
	    obj.addFirst(56);
		assertEquals(2,obj.find(30), 
				"Find method should give the position of the key");
	    obj.addPos(40,3);
	}

	@Test	
	void testCase2() {
	     obj.addFirst(70);
	     obj.addFirst(30);
	     obj.addFirst(40);
	     obj.addFirst(56);
             int pos=obj.find(40);
             obj.delPos(pos); 
               assertEquals(3,obj.size(), 
				"size methode gives the size of the linked list");

}
}
