package TreeSetPro;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	TreeSet CreateTree()
	{
		TreeSet<String> t=new TreeSet<String>();
		t.add("Red");
		t.add("White");
		t.add("pink");
		t.add("black");
		t.add("Green");
		t.add("Yellow");
		return t;
	}
	
	void iterateTree()
	{
			TreeSet<String> t=CreateTree();
			Iterator<String> it = t.iterator();
		   while (it.hasNext())
		   {
			   System.out.println(it.next());
		   }
	}
	
	void addAllinAnother()
	{
		TreeSet t=CreateTree();
		TreeSet t1=new TreeSet();
		t.addAll(t1);
		System.out.println("---"+t1);
	}
	
	void reverseOrder()
	{
		TreeSet<String> t=CreateTree();
		Iterator it=t.descendingIterator();
		System.out.println("Elements in Reverse Order:");
	     while (it.hasNext())
	     {
	        System.out.println(it.next());
	     }
	}
	
	void firstAndLast()
	{
		TreeSet<String> t=CreateTree();
		System.out.println("first="+t.first());
		System.out.println("last="+t.last());
	}
	
	void cloneTree()
	{
		TreeSet<String> t=CreateTree();
		TreeSet t1= (TreeSet) t.clone();
		System.out.println(t1);
	}
	
	void noOfElements()
	{
		TreeSet t=CreateTree();
		System.out.println("No Of Element in Tree="+t.size());
	}
	
	void compareTwoSet()
	{
		boolean flag=false;
		
		TreeSet<String> t=CreateTree();
		TreeSet<String> t1=new TreeSet();
		t1.add("Yellow");
		t1.add("Red");
		t1.add("Green");
		t1.add("Black");
		t1.add("Gray");
		t1.add("pink");
		
		
		for (String element : t)
		{
	           if(t1.contains(element))
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
		}
		else
		{
			System.out.println("Not Same");
		}
	}
	
	void checkLessThanSeven()
	{
		TreeSet<Integer> t1=new TreeSet();
		t1.add(1);
		t1.add(2);
		t1.add(3);
		t1.add(4);
		t1.add(5);
		t1.add(6);
		t1.add(7);
		System.out.println(t1);
		System.out.println(t1.headSet(7));
	}
	
	void greaterORequal()
	{
		TreeSet<Integer> t1=new TreeSet();
		t1.add(11);
		t1.add(21);
		t1.add(34);
		t1.add(43);
		t1.add(25);
		t1.add(61);
		t1.add(67);
		System.out.println(t1);
		System.out.println(t1.ceiling(50));
		System.out.println(t1.ceiling(25));
	}
	
	void lessORequal()
	{
		TreeSet<Integer> t1=new TreeSet();
		t1.add(11);
		t1.add(21);
		t1.add(34);
		t1.add(43);
		t1.add(25);
		t1.add(61);
		t1.add(67);
		System.out.println(t1);
		System.out.println(t1.floor(50));
		System.out.println(t1.floor(25));
	}
	
	void strictlyGreaterORequal()
	{
		TreeSet<Integer> t1=new TreeSet();
		t1.add(11);
		t1.add(21);
		t1.add(34);
		t1.add(43);
		t1.add(25);
		t1.add(61);
		t1.add(67);
		System.out.println(t1);
		System.out.println(t1.higher(50));
		System.out.println(t1.higher(25));
	}
	void strictlyLessORequal()
	{
		TreeSet<Integer> t1=new TreeSet();
		t1.add(11);
		t1.add(21);
		t1.add(34);
		t1.add(43);
		t1.add(25);
		t1.add(61);
		t1.add(67);
		System.out.println(t1);
		System.out.println(t1.lower(50));
		System.out.println(t1.lower(25));
	}
	
	void retrieveRemoveLastEle()
	{
		TreeSet<Integer> t1=new TreeSet();
		t1.add(11);
		t1.add(21);
		t1.add(34);
		t1.add(43);
		t1.add(25);
		t1.add(61);
		t1.add(67);
		System.out.println("Original"+t1);
		t1.pollFirst();
		System.out.println("After remove first element"+t1);
	}
	
	void retrieveRemoveFirstEle()
	{
		TreeSet<Integer> t1=new TreeSet();
		t1.add(11);
		t1.add(21);
		t1.add(34);
		t1.add(43);
		t1.add(25);
		t1.add(61);
		t1.add(67);
		System.out.println("Original"+t1);
		t1.pollLast();
		System.out.println("After remove last element"+t1);
	}
	
	void removeGivenEle()
	{
		TreeSet<Integer> t1=new TreeSet();
		t1.add(11);
		t1.add(21);
		t1.add(34);
		t1.add(43);
		t1.add(25);
		t1.add(61);
		t1.add(67);
		System.out.println("Original"+t1);
		t1.remove(25);
		System.out.println("After remove given element"+t1);
	}
	
	public static void main(String[] args) 
	{
		TreeSetDemo ob=new TreeSetDemo();
		
		System.out.println("\n1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.");
		ob.CreateTree();
		
		System.out.println("\n2. Write a Java program to iterate through all elements in a tree set.");
		ob.iterateTree();
		System.out.println("\n3. Write a Java program to add all the elements of a specified tree set to another tree set.");
		ob.addAllinAnother();
		System.out.println("\n4. Write a Java program to create a reverse order view of the elements contained in a given tree set.");
		ob.reverseOrder();
		System.out.println("\n5. Write a Java program to get the first and last elements in a tree set.");
		ob.firstAndLast();
		System.out.println("\n6. Write a Java program to clone a tree set list to another tree set.");
		ob.cloneTree();
		System.out.println("\n7. Write a Java program to get the number of elements in a tree set.");
		ob.noOfElements();
		System.out.println("\n8. Write a Java program to compare two tree sets.");
		ob.compareTwoSet();
		System.out.println("\n9. Write a Java program to find the numbers less than 7 in a tree set.");
		ob.checkLessThanSeven();
		System.out.println("\n10. Write a Java program to get the element in a tree set which is greater than or equal to the given");
		ob.greaterORequal();
		System.out.println("\n11. Write a Java program to get the element in a tree set which is less than or equal to the given");
		ob.lessORequal();
		System.out.println("\n12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.");
		ob.strictlyGreaterORequal();
		System.out.println("\n13. Write a Java program to get an element in a tree set which is strictly less than the given");
		ob.strictlyLessORequal();
		System.out.println("\n14. Write a Java program to retrieve and remove the first element of a tree set.");
		ob.retrieveRemoveLastEle();
		System.out.println("\n15. Write a Java program to retrieve and remove the last element of a tree set.");
		ob.retrieveRemoveFirstEle();
		System.out.println("\n16. Write a Java program to remove a given element from a tree set.");
		ob.removeGivenEle();
		
	}

	
}
