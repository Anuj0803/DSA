import java.util.*;
public class LL {
	 static Node head;
	 static  class Node{
		int data;
		Node next ;
		
            Node(int data) {
			this.data =data;
			this.next = null;
		}
	}
	 //add element to linked list in first position
	 public static void addfirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	 }
	 
	//add element to linked list in last position
	  public static void addlast(int data) {
		  Node newNode = new Node(data);
		  if(head == null) {
			  head = newNode;
			  return;
		  }
		  Node CurrNode = head;
		  while(CurrNode.next !=null) {
			  CurrNode = CurrNode.next;
		  }
		  CurrNode.next = newNode ;
	  }
	  
	  //Print Linked List
	 public static void PrintList() {
		 if(head==null) {
			 System.out.println("List is empty");
			 return;
		 }
		 Node CurrNode = head;
		  while(CurrNode !=null) {
			  System.out.print(CurrNode.data +"->");
			  CurrNode = CurrNode.next;
		  }
		  System.out.println("Null");
	 }
	 
	 // Find Middle of LinkedList
	 public static Node Middle() {
		 if(head.next == null || head == null) {
			 return head;
		 }
		 Node hare = head;
		 Node tutle = head;
		 while(hare.next !=null && hare.next.next !=null) {
			 hare = hare.next.next;
			 tutle = tutle.next;
		 }
		 return tutle ;
	 }
	 
	 
	 // Delete First from linkedList
	 public static Node deleteFirst() {
		 if(head == null || head.next == null) {
			 return null ;
		 }
		 head = head.next;
		 return head ;
	 }
	 
	 //Delete Last from LinkedList
	 public static Node deletLast() {
		 if(head == null || head.next == null) {
			 return null ;
		 }
		 Node CurrNode = head.next;
		 Node SecondLast = head;
		 while(CurrNode.next !=null) {
			 CurrNode = CurrNode.next;
			 SecondLast = SecondLast.next;
		 }
		 SecondLast.next = null;
		 return CurrNode;
	 }
	 
	 
	 // Size of LinkedList
	 public static int size() {
		 int Count = 1;
		 Node currNode = head;
		 while(currNode.next != null) {
			 Count++;
			 currNode = currNode.next;
		 }
		 return Count;
	 }
	 
	 // Reverse a LinkedList
	 public static void reverse() {
	     if(head == null || head.next ==null) {
	    	 return ;
	     }
	     Node PreNode = head;
	     Node CurrNode = head.next;
	     while(CurrNode !=null) {
	    	 Node nextNode = CurrNode.next;
	    	 CurrNode.next =PreNode ;
	    	 
	    	 PreNode = CurrNode;
	    	 CurrNode = nextNode ;
	     }
	     head.next = null ;
	     head =PreNode;
	 }
	 
	 // Reverse a LinkedList using Recursion
	 public static Node ReverseRecursion(Node head) {
		 if(head==null || head.next ==null) {
			 return head ;
		 }
		 Node newNode = ReverseRecursion(head.next);
		 head.next.next = head;
		 head.next = null ;
		 
		 return newNode;
	 }
	 
	//Delete Middle of LinkedList
	 public static Node DeleteMiddle(Node head) {
		 if(head == null || head.next ==null) {
			 return null;
		 }
		 Node fast = head;
		 Node slow = head;
		 Node copyHead = head;
		 while(fast.next != null && fast.next.next !=null){
			 fast = fast.next.next;
			 slow = slow.next; 
		 }
		 while(head.next !=slow) {
			 head = head.next;
		 }
		 head.next = head.next.next;
		 return copyHead ;
	     
	 }
	 
	 // Detect loop in LinkedList
	 public static boolean Loop() {
		 if(head==null || head.next ==null) {
			 return false;
		 }
		 Node hare = head;
		 Node tutle = head;
		 while(hare !=null && hare.next !=null) {
			 hare = hare.next.next;
			 tutle = tutle.next;
			 if(tutle == hare) {
				 return true;
			 }
		 }
		 return false;
	 }
	 
   public static void main(String args[]) {
	  LL l = new LL();
	  l.addfirst(2);
	  l.addfirst(1);
	  l.addlast(3);
	  l.addlast(4);
	  l.addlast(5);
	  l.PrintList();
	  System.out.println("Size is "+l.size());
	  System.out.println("Middle of Linked List is " + l.Middle().data);
	  l.deleteFirst();
	  l.PrintList();
	  System.out.println("Size is "+l.size());
	  l.deletLast();
	  l.PrintList();
	  System.out.println("Size is "+l.size());
		/*
		 * l.reverse(); l.PrintList();
		 */
	  l.head = l.ReverseRecursion(l.head);
	  l.PrintList();
	  l.head = l.DeleteMiddle(l.head);
	  l.PrintList();
	  System.out.println(l.Loop());
	  
   }

}
