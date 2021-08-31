package ass3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Employee> list=new TreeSet<Employee>();
		list.add(new Employee(1,"Nisha","Dhore"));
		list.add(new Employee(3,"Shamal","Dambe"));
		list.add(new Employee(4,"Ravi","Astarkar"));
		list.add(new Employee(2,"Ram","Astarkar"));
		list.add(new Employee(1,"Manisha","Oberoys"));
		
		
//		TreeSet<Integer> t=new TreeSet();
//		t.add(1);
//		t.add(7);
//		t.add(5);
//		System.out.println("id sort");
		
		
		System.out.println("-------sort asce by id"+list);
//		Collections.sort(list, new ComparatorId());
//		System.out.println("------After sort"+list);
//		
		System.out.println("lastname sorting");
		
		List<Employee> l=new ArrayList<Employee>(list);
		Collections.sort(l, new ComparatorFirstName());
		System.out.println("------After sort"+l);
		
		
		
	}

}
