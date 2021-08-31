package TreeMapPro;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo
{
	
	TreeMap<Integer,String> create()
	{
		TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();      
		  // Put elements to the map 
		  tree_map.put(1, "Red");
		  tree_map.put(2, "Green");
		  tree_map.put(3, "Black");
		  tree_map.put(4, "White");
		  tree_map.put(5, "Blue");
		return tree_map;
	}
	
	void associate()
	{
		TreeMap<Integer,String> tree_map=create();
		 for (Entry<Integer, String> entry : tree_map.entrySet())
		 {
		    System.out.println(entry.getKey() + "=>" + entry.getValue());
		 }
	}
	
	void copyT()
	{
		TreeMap<Integer,String> tree_map=create();
		TreeMap<Integer,String> tree_map2 = new TreeMap<Integer,String>();
		   tree_map2.put(11, "Orange");
		   tree_map2.put(22, "Pink");
		   System.out.println("Tree Map 2: "+tree_map2);
		   tree_map.putAll(tree_map2);
		   System.out.println("After coping map2 to map1: "+tree_map);  
	}
	
	void searchKey()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
        if(t.containsKey(4)){
            System.out.println("The Tree Map contains key 4");
        } else {
            System.out.println("The Tree Map does not contain key 4");
        }
	}
	
	void searchVal()
	{
		TreeMap<Integer,String> t = create();
		if(t.containsValue("Green")){
            System.out.println("The TreeMap contains value Green");
        } else {
            System.out.println("The TreeMap does not contain value Green");
        }
	}
	
	void getAllKey()
	{
		TreeMap<Integer,String> t = create();
		 Set<Integer> keys = t.keySet();
	        for(Integer key: keys){
	            System.out.println(key);
	            }
	}
	
	void deleteAll()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		  t.clear();
		  System.out.println("The New map: "+t);
	}
	
	void sortKeys()
	{
		TreeMap<Integer,String> t = new TreeMap<Integer,String>(new SortKey());
		t.put(1, "Red");
		  t.put(5, "Green");
		  t.put(3, "Black");
		  t.put(2, "White");
		  t.put(4, "Blue");
		System.out.println(t);
	}
	
	void getGreatestLeastKey()
	{
		TreeMap<Integer,String> t = create();
		 System.out.println(t);
		  System.out.println("Greatest key: " + t.firstEntry());
		  System.out.println("Least key: " + t.lastEntry());
	}
	
	void LowHighKey()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		  System.out.println("Greatest key: " + t.firstKey());
		  System.out.println("Least key: " + t.lastKey());
	}
	
	void reverseKey()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		System.out.println("Reverse order view of the keys: " + t.descendingKeySet());
	}
	
	void lessThanOrEqual()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		 System.out.println("Value:" + t.floorEntry(10));
		 System.out.println("Value:" + t.floorEntry(4));
	}
	void greatestKey()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		 System.out.println("key :" + t.floorKey(10));
		 System.out.println("key :" + t.floorKey(4));
	}
	
	void portionStrictlyLess()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		 System.out.println("keys :" + t.headMap(2));
		 System.out.println("keys :" + t.headMap(4));
	}
	
	void portionLess()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		 System.out.println("keys :" + t.headMap(2,true));
		 System.out.println("keys :" + t.headMap(4,true));	
	}
	
	void leastKeyStrictlyGreater()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		System.out.println("entry :" + t.higherEntry(2));
		 System.out.println("entry :" + t.higherEntry(5));
	}
	
	void method16()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		System.out.println("entry :" + t.lowerEntry(2));
		 System.out.println("entry :" + t.lowerEntry(5));
	}
	
	void method17()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		System.out.println("keys :" + t.lowerKey(2));
		 System.out.println("keys :" + t.lowerKey(4));
		
	}
	
	void navigableSetview()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		System.out.println(t.navigableKeySet());
	}
	
	void method19()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		System.out.println("Value returned: " + t.pollFirstEntry());
		  System.out.println(t);
	}
	
	void method20()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		System.out.println("Value returned: " + t.pollLastEntry());
		  System.out.println(t);
	}
	
	void method21()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		SortedMap<Integer, String> sub_t= new TreeMap<Integer,String>();
		  sub_t= t.subMap(2, 4);
		  System.out.println("Sub map : " + sub_t);
	}
	
	void method22()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		SortedMap<Integer, String> sub_t= new TreeMap<Integer,String>();
		  sub_t= t.subMap(2,true, 4,true);
		  System.out.println("Sub map : " + sub_t);
	}
	void method23()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		System.out.println("Keys are greater than or equal to 2: " + t.tailMap(2));
	}
	
	void method24()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		System.out.println("Keys are greater than 2: " + t.tailMap(2,false));
	}
	
	void method25()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		 System.out.println("Keys greater than or equal to 2: " + t.ceilingEntry(2));
		 System.out.println("Keys greater than or equal to 6: " + t.ceilingEntry(6));
	}
	
	void method26()
	{
		TreeMap<Integer,String> t = create();
		System.out.println(t);
		 System.out.println("Keys greater than or equal to 2: " + t.ceilingKey(2));
		 System.out.println("Keys greater than or equal to 6: " + t.ceilingKey(6));
	}
	public static void main(String[] args) {
		TreeMapDemo ob=new TreeMapDemo();
		
		System.out.println("\n1. Write a Java program to associate the specified value with the specified key in a Tree Map.");
		ob.associate();
		System.out.println("\n2. Write a Java program to copy a Tree Map content to another Tree Map.");
		ob.copyT();
		System.out.println("\n3. Write a Java program to search a key in a Tree Map.");
		ob.searchKey();
		System.out.println("\n4. Write a Java program to search a value in a Tree Map.");
		ob.searchVal();
		System.out.println("\n5. Write a Java program to get all keys from the given a Tree Map.");
		ob.getAllKey();
		System.out.println("\n6. Write a Java program to delete all elements from a given Tree Map.");
		ob.deleteAll();
		System.out.println("\n7. Write a Java program to sort keys in Tree Map by using comparator.");
		ob.sortKeys();
		System.out.println("\n8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.");
		ob.getGreatestLeastKey();
		System.out.println("\n9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.");
		ob.LowHighKey();
		System.out.println("\n10. Write a Java program to get a reverse order view of the keys contained in a given map.");
		ob.reverseKey();
		System.out.println("\n11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.");
		ob.lessThanOrEqual();
		System.out.println("\n12. Write a Java program to get the greatest key less than or equal to the given key.");
		ob.greatestKey();
		System.out.println("\n13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.");
		ob.portionStrictlyLess();
		System.out.println("\n14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.");
		ob.portionLess();
		System.out.println("\n15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.");
		ob.leastKeyStrictlyGreater();
		System.out.println("\n16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.");
		ob.method16();
		System.out.println("\n17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.");
		ob.method17();
		System.out.println("\n18. Write a Java program to get NavigableSet view of the keys contained in a map.");
		ob.navigableSetview();
		System.out.println("\n19. Write a Java program to remove and get a key-value mapping associated with the least key in a map.");
		ob.method19();
		System.out.println("\n20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.");
		ob.method20();
		System.out.println("\n21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).");
		ob.method21();
		System.out.println("\n22. Write a Java program to get the portion of a map whose keys range from a given key to another key.");
		ob.method22();
		System.out.println("\n23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.");
		ob.method23();
		System.out.println("\n24. Write a Java program to get a portion of a map whose keys are greater than to a given key.");
		ob.method24();
		System.out.println("\n25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.");
		ob.method25();
		System.out.println("\n26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.");
		ob.method26();
	}

}
