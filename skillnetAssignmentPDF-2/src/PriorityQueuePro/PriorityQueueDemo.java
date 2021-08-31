package PriorityQueuePro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueDemo 
{
	PriorityQueue<String> create()
	{
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		  queue.add("Red");
		  queue.add("Green");
		  queue.add("Orange");
		  queue.add("White");
		  queue.add("Black");
		  return queue;  
	}
	void print()
	{
		PriorityQueue<String> queue=create();
		System.out.println("Elements of the Priority Queue: ");
		System.out.println(queue);
	}
	
	void iterate()
	{
		PriorityQueue<String> queue=create();
		System.out.println("Elements of the Priority Queue: ");
		for (String element : queue) {
		    System.out.println(element);
		    }
	}
	
	void addAllIntoAnother()
	{
		PriorityQueue<String> queue=create();
		System.out.println(queue);
		PriorityQueue<String> queue2 = new PriorityQueue<String>();  
		  queue2.add("Pink");
		  queue2.add("White");
		  queue2.add("Black");
		  System.out.println(queue2);
		   queue.addAll(queue2);
		   System.out.println("New Priority Queue1: "+queue);
	}
	
	void insert()
	{
		PriorityQueue<String> queue=create();
		System.out.println(queue);
		queue.offer("Purple");
		System.out.println(queue);
	}
	void removeAllQ()
	{
		PriorityQueue<String> queue=create();
		System.out.println(queue);
		queue.clear();
		System.out.println(queue);
	}
	
	void countElements()
	{
		PriorityQueue<String> queue=create();
		System.out.println(queue);
		System.out.println("no of elements : "+queue.size());
	}
	
	void compare()
	{
		PriorityQueue<String> queue=create();
		System.out.println(queue);
		 PriorityQueue<String> queue1 = new PriorityQueue<String>();  
		 queue1.add("Red");
		 queue1.add("Pink");
		 queue1.add("Black");
		 queue1.add("Orange");
         System.out.println(queue1);
         //comparison output in Priority Queue
        for (String element : queue){
            System.out.println(queue1.contains(element) ? "Yes" : "No");
        }
	}
	
	void retrieveFirst()
	{
		PriorityQueue<String> queue=create();
		System.out.println(queue);
		System.out.println("first elements : "+queue.peek());		
	}
	
	void retrieveRemoveFirst()
	{
		PriorityQueue<String> queue=create();
		System.out.println(queue);
		System.out.println("first elements : "+queue.poll());	
		System.out.println(queue);
	}
	
	void convertToArray()
	{
		PriorityQueue<String> queue=create();
		System.out.println(queue);
		List<String> array_list = new ArrayList<String>(queue);
		System.out.println("Array containing all of the elements in the queue: "+array_list);
	}
	
	void convertToString()
	{
		PriorityQueue<String> queue=create();
		System.out.println(queue);	
		String str1;
		str1 = queue.toString();
		System.out.println("String representation of the Priority Queue: "+str1);  
	}
	
	void changeP()
	{
		 PriorityQueue<Integer> pq1 = new PriorityQueue<>(10, Collections.reverseOrder());
	      
		   // Add numbers in the Queue
		   pq1.add(10);
		   pq1.add(22);
		   pq1.add(36);
		   pq1.add(25);
		   pq1.add(16);
		   pq1.add(70);
		   pq1.add(82);
		   pq1.add(89);
		   pq1.add(14);
		   System.out.println("\nOriginal Priority Queue: "+pq1);
		System.out.print("\nMaximum Priority Queue: ");
		Integer val = null;
		while( (val = pq1.poll()) != null) {
		    System.out.print(val+"  ");
		      }
	}
	
	
	public static void main(String[] args) {
		PriorityQueueDemo ob=new PriorityQueueDemo();
		
		System.out.println("\n1. Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.");
		ob.print();
		System.out.println("\n2. Write a Java program to iterate through all elements in priority queue.");
		ob.iterate();
		System.out.println("\n3. Write a Java program to add all the elements of a priority queue to another priority queue.");
		ob.addAllIntoAnother();
		System.out.println("\n4. Write a Java program to insert a given element into a priority queue.");
		ob.insert();
		System.out.println("\n5. Write a Java program to remove all the elements from a priority queue.");
		ob.removeAllQ();
		System.out.println("\n6. Write a Java program to count the number of elements in a priority queue.");
		ob.countElements();
		System.out.println("\n7. Write a Java program to compare two priority queues.");
		ob.compare();
		System.out.println("\n8. Write a Java program to retrieve the first element of the priority queue.");
		ob.retrieveFirst();
		System.out.println("\n9. Write a Java program to retrieve and remove the first element.");
		ob.retrieveRemoveFirst();
		System.out.println("\n10. Write a Java program to convert a priority queue to an array containing all of the elements of the queue.");
		ob.convertToArray();
		System.out.println("\n11. Write a Java program to convert a Priority Queue elements to a string representation.");
		ob.convertToString();
		System.out.println("\n12. Write a Java program to change priorityQueue to maximum priorityqueue.");
		ob.changeP();
	}

}
