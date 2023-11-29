package com.bridgelabz.linkedlist.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.main.linkedlist.CustomLL;
import com.bridgelabz.main.linkedlist.LL;

class LLtest {
    CustomLL obj=new CustomLL();

	@Test
	void testCase1() {
	    obj.addLast(56);
	    obj.addLast(30);
	    obj.addLast(70);
		assertEquals(2,obj.find(30), 
				"Find method should give the position of the key");
		obj.addPos(40,3);
		
			
	}
	void testCase2() {
	    obj.addLast(56);
	    obj.addLast(30);
	    obj.addLast(70);
	    int pos=obj.find(30);
	    obj.addPos(40, pos+1);
	    assertEquals(3,obj.find(40), 
				"Find method should give the position of the key");

}
}