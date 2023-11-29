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
// UC 2
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
 * @desc:add elements in linked list
 * @params:Integer data
 * @return:none
 */  
//UC 3
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
 * @desc:add elements in linked list
 * @params:Integer data AND POS
 * @return:none
 */
 //UC 4
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
  * @desc:DEL elements in linked list
  * @params:NONE
  * @return:none
  */
 //UC 5
 public  void delFirst() {
	   if(head == null) {
		   System.out.println("Empty");
	   }
	   else {
		   head=head.next;
	   }
   }
 
 
 /*
  * @desc:DEL elements in linked list
  * @params:NONE
  * @return:none
  */
 //UC 6
 public	void delLast() {
 		if(head==null) {
 			System.out.println("Empty");
 		}
 		else {
 			Node curr=head;
 			Node prev=curr;
 			while(curr.next != null) {
 				prev=curr;
 				curr=curr.next;
 			}
 			prev.next=null;
 		}
 }
// 	}
   
  /*
 * @desc:FIND elements in linked list
 * @params:INTEGER ELEMENT
  * @return:none
  */		
 //UC 7

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



//UC 9
/*
* @desc:DEL elements in linked list
* @params:INTEGER ELEMENT
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
* @desc:FIND SIZE OF linked list
* @params:INTEGER ELEMENT
* @return:none
*/
public int size() {
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

//UC 10
class SortedLinkedList<T extends Comparable<T>> {
    private Node<T> head;
    public static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    
    /*
    * @desc:ADD ELEMENT IN linked list
    * @params:T OBJECT ELEMENT
    * @return:none
    */
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null || data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null && data.compareTo(current.next.data) > 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    /*
     * @desc:DISPLAY ELEMENT IN linked list
     * @params:T OBJECT ELEMENT
     * @return:none
     */
    public void display() {
        Node<T> current = head;
        while (current.next != null) {
            System.out.print(current.data + " -->");
            current = current.next;
        }
        System.out.println(current.data);
    }
}




 