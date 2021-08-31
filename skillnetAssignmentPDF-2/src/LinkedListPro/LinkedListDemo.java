package LinkedListPro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo
{
	LinkedList<String> createLinkedList()
	{
		LinkedList<String> l=new LinkedList();
		l.add("White");
		l.add("Red");
		l.add("Green");
		l.add("Orange");
		l.add("Blue");
		return l;
	}
	
	void appendToEnd()
	{
		LinkedList l=createLinkedList();
		System.out.println("Add element at last:");
		l.addLast("Black");
		System.out.println("List:"+l);
	}
	
	void iterateLL()
	{
		LinkedList l=createLinkedList();
		Iterator itr=l.iterator();
		while(itr.hasNext()) 
		{
			System.out.print(itr.next()+",");
		}
	}
	
	void iterateLLspecified()
	{
		LinkedList l=createLinkedList();
		Iterator itr2=l.listIterator(2);
		while(itr2.hasNext()) 
		{
			System.out.print(itr2.next()+",");
		}
	}
	
	void iterateRev()
	{
		LinkedList l=createLinkedList();
		Iterator itr3=l.descendingIterator();
		while(itr3.hasNext()) 
		{	
			System.out.print(itr3.next()+",");
		}
	}
	
	void insertAtspecified()
	{
		LinkedList l=createLinkedList();
		l.add(3, "Purple");
		System.out.println("List:"+l);
	}
	
	void insertFirstLast()
	{
		LinkedList l=createLinkedList();
		l.addFirst("White");
		l.addLast("Black");
		System.out.println("List:"+l);
	}
	
	void insertAtFront()
	{
		LinkedList l=createLinkedList();
		l.offerFirst("Brown");
		System.out.println("List:"+l);
		
	}
	
	void insertAtEnd()
	{
		LinkedList l=createLinkedList();
		l.offerLast("Grey");
		System.out.println("List:"+l);
		
	}
	void insertSomeElements()
	{
		LinkedList l=createLinkedList();
		LinkedList l1 = new LinkedList();
		  l1.add("White");
		  l1.add("Pink");
		  l.addAll(1, l1);
		  System.out.println("List:" + l);
	}
	
	void getFirstLastOccurance()
	{
		LinkedList l=createLinkedList();
		System.out.println("first"+l.getFirst());
		System.out.println("last"+l.getLast());		
	}
	void displayElementsAndPosition()
	{
		LinkedList l=createLinkedList();
		for(int i=0; i < l.size(); i++)
		   {
		      System.out.println("Element at index "+i+": "+l.get(i));
		   } 
	}
	
	void removeSpecified()
	{
		LinkedList l=createLinkedList();
		 System.out.println("List:" + l);
		l.remove(2);
		System.out.println("The New linked list: " + l);
	}
	
	void removeFirstLast()
	{
		LinkedList l=createLinkedList();
		Object firstElement = l.removeFirst();
	    System.out.println("Element removed: "+ firstElement);
	    Object lastElement = l.removeLast();
	    System.out.println("Element removed: "+ lastElement);
	    System.out.println("The New linked list: " + l);
	}
	 void removeAllFromLL()
	 {
		 LinkedList l=createLinkedList();
		 l.clear();
		 System.out.println("List:" + l);
	 }
	
	 void swap()
	 {
		 LinkedList l=createLinkedList();
		 System.out.println("List:" + l);
		 Collections.swap(l, 0, 2);
		 System.out.println("The New linked list after swap: " + l);
	 }
	
	 void shuffle()
	 {
		 LinkedList l=createLinkedList();
		 System.out.println(l);  
		  Collections.shuffle(l);
		  System.out.println("Linked list after shuffling:" + l); 
	 }
	 
	 void joinLL()
	 {
		 LinkedList l=createLinkedList();
		 LinkedList l1=new LinkedList();
		 l1.add("AA");
		 l1.add("BB");
		 l1.add("CC");
		 LinkedList <String> a = new LinkedList <String> ();
	        a.addAll(l);
	        a.addAll(l1);
	        System.out.println("New linked list: " + a);
	 }
	 
	 void cloneLL()
	 {
		 LinkedList l=createLinkedList();
		 LinkedList l1=new LinkedList();
		 l1 = (LinkedList)l.clone();
         System.out.println("Cloned linked list: " + l1);    
	 }
	 
	 void removeReturnFirstElement()
	 {
		 LinkedList l=createLinkedList();
		 System.out.println("Removed element: "+l.pop());
	     System.out.println(l);
	 }
	 
	 void retrieveButNotRemoveFirstElement()
	 {
		 LinkedList l=createLinkedList();
		 String x = (String) l.peekFirst();
		    System.out.println("First element in the list: " + x);
		    System.out.println(l);   
	 }
	 
	 void retrieveButNotRemoveLastElement()
	 {
		 LinkedList l=createLinkedList();
		 String x = (String) l.peekLast();
		    System.out.println("First element in the list: " + x);
		    System.out.println(l);   
	 }
	 
	 void existOrNot()
	 {
		 LinkedList l=createLinkedList();
		 if (l.contains("Green")) {
		       System.out.println("yes");
		    } else {
		       System.out.println("no");
		     }
	 }
	  void convertToArrayList()
	  {
		  LinkedList l=createLinkedList();
		  List<String> al = new ArrayList<String>(l);
		    for (String str : al){
		      System.out.println(str);
		    }
	  }
		  
	  void compareLL()
	  {
		  LinkedList<String> l=createLinkedList();
		  LinkedList l1=new LinkedList();
		  l1.add("Orange");
		  l1.add("BB");
		  l1.add("Red");
		  LinkedList<String> l2 = new LinkedList<String>();
		  for (String s : l)
		  {
			  l2.add(l1.contains(s) ? "Yes" : "No");
		  }
          System.out.println(l2);  
	  }
	  
	  void isEmpty()
	  {
		  LinkedList<String> l=createLinkedList();
		  System.out.println(l.isEmpty());
	  }
	  
	 void replace()
	 {
		 LinkedList<String> l=createLinkedList();
		 l.set(1, "Pink");
		 System.out.println(l);
	 }
	  
	public static void main(String[] args)
	{
		LinkedListDemo ob=new LinkedListDemo();
		
		System.out.println("\n1. Write a Java program to append the specified element to the end of a linked list.");
		ob.appendToEnd();
		System.out.println("\n2. Write a Java program to iterate through all elements in a linked list.");
		ob.iterateLL();
		System.out.println("\n3. Write a Java program to iterate through all elements in a linked list starting at the specified position.");
		ob.iterateLLspecified();
		System.out.println("\n4. Write a Java program to iterate a linked list in reverse order.");
		ob.iterateRev();
		System.out.println("\n5. Write a Java program to insert the specified element at the specified position in the linked list.");
		ob.insertAtspecified();
		System.out.println("\n6. Write a Java program to insert elements into the linked list at the first and last position.");
		ob.insertFirstLast();
		System.out.println("\n7. Write a Java program to insert the specified element at the front of a linked list.");
		ob.insertAtFront();
		System.out.println("\n8. Write a Java program to insert the specified element at the end of a linked list.");
		ob.insertAtEnd();
		System.out.println("\n9. Write a Java program to insert some elements at the specified position into a linked list.");
		ob.insertSomeElements();
		System.out.println("\n10. Write a Java program to get the first and last occurrence of the specified elements in a linked List");
		ob.getFirstLastOccurance();
		System.out.println("\n11. Write a Java program to display the elements and their positions in a linked list.");
		ob.displayElementsAndPosition();
		System.out.println("\n12. Write a Java program to remove a specified element from a linked list.");
		ob.removeSpecified();
		System.out.println("\n13. Write a Java program to remove first and last element from a linked list.");
		ob.removeFirstLast();
		System.out.println("\n14. Write a Java program to remove all the elements from a linked list.");
		ob.removeAllFromLL();
		System.out.println("\n15. Write a Java program of swap two elements in an linked list.");
		ob.swap();
		System.out.println("\n16. Write a Java program to shuffle the elements in a linked list.");
		ob.shuffle();
		System.out.println("\n17. Write a Java program to join two linked lists.");
		ob.joinLL();
		System.out.println("\n18. Write a Java program to clone an linked list to another linked list.");
		ob.cloneLL();
		System.out.println("\n19. Write a Java program to remove and return the first element of a linked list.");
		ob.removeReturnFirstElement();
		System.out.println("\n20. Write a Java program to retrieve but does not remove, the first element of a linked list.");
		ob.retrieveButNotRemoveFirstElement();
		System.out.println("\n21. Write a Java program to retrieve but does not remove, the last element of a linked list.");
		ob.retrieveButNotRemoveLastElement();
		System.out.println("\n22. Write a Java program to check if a particular element exists in a linked list.");
		ob.existOrNot();
		System.out.println("\n23. Write a Java program to convert a linked list to array list.");
		ob.convertToArrayList();
		System.out.println("\n24. Write a Java program to compare two linked lists.");
		ob.compareLL();
		System.out.println("\n25. Write a Java program to test an linked list is empty or not.");
		ob.isEmpty();
		System.out.println("\n26. Write a Java program to replace an element in a linked list.");
		ob.replace();
		
		
	
	}
}
