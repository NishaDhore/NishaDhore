package HashSetPro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class HashSetDemo {

	HashSet<String> h = new HashSet<String>();
	
	void appendSecifiedEleAtEnd()
	{
		h.add("Red");
		h.add("Green");
		h.add("Black");
		h.add("White");
		h.add("Pink");
		h.add("Yellow");
		System.out.println("The Hash Set: " + h);   
	}
	
	void iteratrElements()
	{
		 Iterator<String> p = h.iterator();
		   while (p.hasNext())
		   {
			   System.out.println(p.next());
		   }
	}
	
	void getNoOfElements()
	{
		System.out.println("Size of the Hash Set: " + h.size());
		
	}
	
	void empty()
	{
		 h.removeAll(h);
		 System.out.println("Hash Set after removing all the elements "+h);   
	}
	
	void isemptyOrnot()
	{
		System.out.println("Checking the above array list is empty or not - "+h.isEmpty());
	}
	
	void cloneHashSet()
	{
		h.add("Red");
		h.add("Green");
		h.add("Black");
		h.add("White");
		h.add("Pink");
		h.add("Yellow");
//		System.out.println("The Hash Set: " + h);   
		
		HashSet <String> h1 = new HashSet <String> ();
        h1 = (HashSet)h.clone();
        System.out.println("Cloned Hash Set: " + h1);   
	}
	
	void convertToArray()
	{
		String[] arr = new String[h.size()];
	      h.toArray(arr);
	     System.out.println("Array elements are: ");
	      for(String s : arr)
	      {
	        System.out.println(s);
	      }
	}
	
	void convertToTreeSet()
	{
		TreeSet<String> tree = new TreeSet<String>(h);
	     System.out.println("TreeSet elements: ");
	     System.out.println(tree);
	}
	
	void convertToArrayList()
	{
		List<String> list = new ArrayList<String>(h);
	     System.out.println("ArrayList contains: ");
	     System.out.println(list);
	}
	
	void compareTwoHashSet()
	{	boolean flag=false;
	
		System.out.println("--h--"+h);
	
		HashSet <String> h1 = new HashSet <String> ();
		h1.add("Red");
		h1.add("Green");
		h1.add("Black");
		h1.add("White");
		h1.add("Pink");
		h1.add("Yellow");
		System.out.println("--h1--"+h1);
		
		for (String element : h)
		{
	           if(h1.contains(element))
	           {
	        	  flag=true;
	           }
	           else
	           {
	        	   flag=false;
	        	   break;
	           }
		}   
		if(flag) 
		{
			System.out.println("Same");
		}else 
		{
			System.out.println("Not Same");
		}
	}
	
	void compareAndRetain()
	{
		
		System.out.println("--h--"+h);
	
		HashSet <String> h1 = new HashSet <String> ();
		h1.add("Red");
		h1.add("Green");
		h1.add("Black");
		h1.add("White");
		h1.add("Pink");
		h1.add("Gray");
		System.out.println("--h1--"+h1);
		
		System.out.println("same elements are:");
		for (String element : h)
		{
	           if(h1.contains(element))
	           {
	        	  System.out.println(element);
	           }
		}   		
	}
	
	void removeElements()
	{	
		System.out.println("Before"+h);
		h.removeAll(h);
		System.out.println("After"+h);
		
	}
	
	public static void main(String[] args)
	{
		HashSetDemo ob= new HashSetDemo();
		System.out.println("\n1. Write a Java program to append the specified element to the end of a hash set.");
		ob.appendSecifiedEleAtEnd();
		System.out.println("\n2. Write a Java program to iterate through all elements in a hash list.");
		ob.iteratrElements();
		System.out.println("\n3. Write a Java program to get the number of elements in a hash set.");
		ob.getNoOfElements();
		System.out.println("\n4. Write a Java program to empty an hash set.");
		ob.empty();
		System.out.println("\n5. Write a Java program to test a hash set is empty or not.");
		ob.isemptyOrnot();
		System.out.println("\n6. Write a Java program to clone a hash set to another hash set.");
		ob.cloneHashSet();
		System.out.println("\n7. Write a Java program to convert a hash set to an array.");
		ob.convertToArray();
		System.out.println("\n8. Write a Java program to convert a hash set to a tree set.");
		ob.convertToTreeSet();
		System.out.println("\n9. Write a Java program to convert a hash set to a List/ArrayList.");
		ob.convertToArrayList();
		System.out.println("\n10. Write a Java program to compare two hash set.");
		ob.compareTwoHashSet();
		System.out.println("\n11. Write a Java program to compare two sets and retain elements which are same on both sets.");
		ob.compareAndRetain();
		System.out.println("\n12. Write a Java program to remove all of the elements from a hash set.");
		ob.removeElements();
	}
}
