package HashMapPro;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo 
{
	HashMap<Integer,String> createHashMap()
	{
		 HashMap<Integer,String> h= new HashMap<Integer,String>();  
		  h.put(1, "Red");
		  h.put(2, "Green");
		  h.put(3, "Black");
		  h.put(4, "White");
		  h.put(5, "Blue");
		  
		return h;	
	}
	
	void associateKeyValue()
	{
		HashMap<Integer,String> h = createHashMap();
		for(HashMap.Entry a:h.entrySet())
		{  
			   System.out.println(a.getKey()+" "+a.getValue());  
		}  
	}
	
	void countKeyValue()
	{
		HashMap<Integer,String> h = createHashMap();
		System.out.println(h.size());
	}
	
	void copyMap()
	{
		HashMap<Integer,String> h = createHashMap();
		HashMap<Integer,String> h1 = new HashMap<Integer,String> ();
		System.out.println(h1);
		h1.putAll(h);
		System.out.println(h1);
	}
	
	void removeAll()
	{
		HashMap<Integer,String> h = createHashMap();
		System.out.println(h);
		h.clear();
		System.out.println(h);
		
	}
	
	void checkIsEmpty()
	{
		HashMap<Integer,String> h = createHashMap();
		System.out.println(h);
		System.out.println(h.isEmpty());
	}
	
	void shallowCopy()
	{
		HashMap<Integer,String> h = createHashMap();
		HashMap<Integer,String> h1 = new HashMap<Integer,String> ();
		System.out.println(h1);
		h1=(HashMap<Integer, String>) h.clone();
		System.out.println(h1);
	}
	
	void checkMappingExistORnot()
	{
		HashMap<Integer,String> h = createHashMap();
		System.out.println("check Is key 'orange' exists?");
		  if (h.containsKey("orange")) 
		  {
		   System.out.println("yes! - " + h.get("orange"));
		  }
		  else {
		   System.out.println("no!");
		  }
	}
	
	void checkMappingValueExistORnot()
	{
		HashMap<Integer,String> h = createHashMap();
		System.out.println("check Is 'Black' exists?");
		  if (h.containsValue("Black")) 
		  {
		   System.out.println("yes");
		  }
		  else {
		   System.out.println("no");
		  }
	}
	
	void setViewOfMapping()
	{
		HashMap<Integer,String> h = createHashMap();
		Set set = h.entrySet();
		System.out.println("Set : " + set);
	}
	
	void getValueOfSpecifiedKey()
	{
		HashMap<Integer,String> h = createHashMap();
		System.out.println("Value for key 3 is: " + h.get(3));
	}
	
	void setViewOfKey()
	{
		HashMap<Integer,String> h = createHashMap();
		Set keyset = h.keySet();
	    System.out.println("Key set values are: " + keyset);  
	}
	
	void collectionView()
	{
		HashMap<Integer,String> h = createHashMap();
		System.out.println(h.values());
	}
	
	public static void main(String[] args) {
		HashMapDemo ob=new HashMapDemo();
		
		System.out.println("\n1. Write a Java program to associate the specified value with the specified key in a HashMap.");
		ob.associateKeyValue();
		System.out.println("\n2. Write a Java program to count the number of key-value (size) mappings in a map.");
		ob.countKeyValue();
		System.out.println("\n3. Write a Java program to copy all of the mappings from the specified map to another map.");
		ob.copyMap();
		System.out.println("\n4. Write a Java program to remove all of the mappings from a map.");
		ob.removeAll();
		System.out.println("\n5. Write a Java program to check whether a map contains key-value mappings (empty) or not.");
		ob.checkIsEmpty();
		System.out.println("\n6. Write a Java program to get a shallow copy of a HashMap instance.");
		ob.shallowCopy();
		System.out.println("\n7. Write a Java program to test if a map contains a mapping for the specified key.");
		ob.checkMappingExistORnot();
		System.out.println("\n8. Write a Java program to test if a map contains a mapping for the specified value.");
		ob.checkMappingValueExistORnot();
		System.out.println("\n9. Write a Java program to create a set view of the mappings contained in a map.");
		ob.setViewOfMapping();
		System.out.println("\n10. Write a Java program to get the value of a specified key in a map.");
		ob.getValueOfSpecifiedKey();
		System.out.println("\n11. Write a Java program to get a set view of the keys contained in this map.");
		ob.setViewOfKey();
		System.out.println("\n12. Write a Java program to get a collection view of the values contained in this map.");
		ob.collectionView();
		
		
	}

}
