import java.util.*;
public class Stack_LL {
	public static Node head;
	public static class Node{
		int data;
		Node next;
		
		   Node(int data) {
			this.data= data;
			this.next= null;
		}
	}
	public static boolean isEmpty() {
		return head==null ;
	}
	
	public static void push(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
		    return;
		}
		newNode.next=head;
		head= newNode;
	}
	
	public static int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}
		int top = head.data;
		head = head.next;
		return top;
	}
	
	public static int peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}
		return head.data;
	}
	
	
	public static class Stack{
		public static void main(String args[]) {
			Stack_LL ll = new Stack_LL();
		    ll.push(1);
		    ll.push(2);
		    ll.push(3);
		    ll.push(4);
			
		    while(! ll.isEmpty()) {
		    	System.out.println(ll.peek());
		    	ll.pop();
		    }
			
		}
	}
}
