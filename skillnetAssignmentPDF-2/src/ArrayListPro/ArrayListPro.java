package ArrayListPro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPro 
{
	List<String> create()
	{
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		System.out.println(list);
		return list;
	}
	
	void iterate()
	{
		List<String> list=create();
		for (String element : list) {
		    System.out.println(element);
		}
	}
	
	void insertAtFirst()
	{
		List<String> list=create();
		 list.add(0, "Pink");
		 System.out.println(list);
	}
	
	void RetrieveFromSpecifiedIndex()
	{
		List<String> list=create();
		System.out.println(list.get(4));
	}
	
	void updateArray()
	{
		List<String> list=create();
		list.set(2, "Yellow");
		  System.out.println(list);
	}
	
	void removeThird()
	{
		List<String> list=create();
		list.remove(3);
		System.out.println(list);
	}
	
	void search()
	{
		List<String> list=create();
		if (list.contains("Red")) {
		    System.out.println("Found the element");
		    } else {
		    System.out.println("There is no such element");
		    }
	}
	
	void sort()
	{
		List<String> list=create();
		Collections.sort(list);
		  System.out.println("List after sort: "+list);    
	}
	
	void copy()
	{
		List<String> list=create();
		List<String> list1=new ArrayList<String>();
		System.out.println(list);
		Collections.copy(list, list1);
		System.out.println(list1);
	}
	
	void shuffle()
	{
		List<String> list=create();
		Collections.shuffle(list);
		  System.out.println("List after shuffling:\n" + list); 
	}
	
	void reverse()
	{
		List<String> list=create();
		Collections.reverse(list);
		  System.out.println("List after reversing :\n" + list); 
	}
	
	void extractPortion()
	{
		List<String> list=create();
		List<String> sub_List = list.subList(0, 3);
		  System.out.println("List of first three elements: " + sub_List);
	}
	
	void compare()
	{
		List<String> list=create();
		List<String> list1=new ArrayList<String>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Black");
		list1.add("Pink");
		ArrayList<String> list2 = new ArrayList<String>();
        for (String e : list)
           list2.add(list1.contains(e) ? "Yes" : "No");
        System.out.println(list2);
	}
	
	void swap()
	{
		List<String> list=create();
		Collections.swap(list, 0, 2);
        System.out.println("Array list after swap:");
        System.out.println(list);
	}
	
	void join()
	{
		List<String> list=create();
		List<String> list1=new ArrayList<String>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Black");
		list1.add("Pink");
		ArrayList<String> joinedList = new ArrayList<String>();
		joinedList.addAll(list);
		joinedList.addAll(list1);
	        System.out.println("New array: " + joinedList);
	}
	
	void cloneAL()
	{
		List<String> list=create();
		ArrayList<String> list1 = (ArrayList<String>) ((ArrayList<String>) list).clone();
        System.out.println("Cloned array list: " + list1);  
	}
	
	void Empty()
	{
		List<String> list=create();
		list.removeAll(list);
        System.out.println("Array list after remove all elements "+list);  
	}
	
	void isEmptyORnot()
	{
		List<String> list=create();
		System.out.println(list.isEmpty());
	}
	
	void trim()
	{
		List<String> list=create();
		System.out.println("Let trim to size the above array: ");
        ((ArrayList<String>) list).trimToSize();
        System.out.println(list);
	}
	
	void increase()
	{
		List<String> list=create();
		((ArrayList<String>) list).ensureCapacity(8);
        list.add("AA");
        list.add("BB");
        list.add("CC");
        System.out.println("New array list: " + list);
	}
	
	void replaceSecond()
	{
		List<String> list=create();
		 String new_color = "White";
		 list.set(1,new_color);
		  int num=list.size();
		  System.out.println("Replace second element with 'White'."); 
		  for(int i=0;i<num;i++)
		  System.out.println(list.get(i));
	}
	
	void printUsingPosition()
	{
		List<String> list=create();
		System.out.println("\nPrint using index of an element: ");
		  int n = list.size();
		  for (int i = 0; i < n; i++)
		   System.out.println(list.get(i));
	}
	public static void main(String[] args) {
		ArrayListPro ob=new ArrayListPro();
		
		System.out.println("\n1. Write a Java program to create a new array list, add some colors (string) and print out the collection.");
		ob.create();
		System.out.println("\n2. Write a Java program to iterate through all elements in a array list.");
		ob.iterate();
		System.out.println("\n3. Write a Java program to insert an element into the array list at the first position.");
		ob.insertAtFirst();
		System.out.println("\n4. Write a Java program to retrieve an element (at a specified index) from a given array list.");
		ob.RetrieveFromSpecifiedIndex();
		System.out.println("\n5. Write a Java program to update specific array element by given element.");
		ob.updateArray();
		System.out.println("\n6. Write a Java program to remove the third element from a array list.");
		ob.removeThird();
		System.out.println("\n7. Write a Java program to search an element in a array list.");
		ob.search();
		System.out.println("\n8. Write a Java program to sort a given array list.");
		ob.sort();
		System.out.println("\n9. Write a Java program to copy one array list into another.");
		ob.copy();
		System.out.println("\n10. Write a Java program to shuffle elements in a array list.");
		ob.shuffle();
		System.out.println("\n11. Write a Java program to reverse elements in a array list.");
		ob.reverse();
		System.out.println("\n12. Write a Java program to extract a portion of a array list.");
		ob.extractPortion();
		System.out.println("\n13. Write a Java program to compare two array lists.");
		ob.compare();
		System.out.println("\n14. Write a Java program of swap two elements in an array list.");
		ob.swap();
		System.out.println("\n15. Write a Java program to join two array lists.");
		ob.join();
		System.out.println("\n16. Write a Java program to clone an array list to another array list.");
		ob.cloneAL();
		System.out.println("\n17. Write a Java program to empty an array list.");
		ob.Empty();
		System.out.println("\n18. Write a Java program to test an array list is empty or not.");
		ob.isEmptyORnot();
		System.out.println("\n19. Write a Java program to trim the capacity of an array list the current list size.");
		ob.trim();
		System.out.println("\n20. Write a Java program to increase the size of an array list.");
		ob.increase();
		System.out.println("\n21. Write a Java program to replace the second element of a ArrayList with the specified element.");
		ob.replaceSecond();
		System.out.println("\n22. Write a Java program to print all the elements of a ArrayList using the position of the elements.");
		ob.printUsingPosition();
	
	}

}
