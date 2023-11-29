package com.bridgelabz.main.linkedlist;

class Node{
	int data;
	Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
}
//@DESC: USIING GENERIC CLASS AND COMPARABLE
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
* @desc:add elements in linked list
* @params:Integer data
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
  * @desc:display the elements of the LL
  * @params:none
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



 
 /*
 * @desc:DEL last elements in linked list
 * @params:none
 * @return:none
 */
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


 
