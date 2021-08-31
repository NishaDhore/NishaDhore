package ass3Worr;

import java.util.ArrayList;
import java.util.Collections;

public class TestWorrier
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(new Worrier("bRam","Sharma",30,5));
		list.add(new Worrier("cSham","Bhosle",25,1));
		list.add(new Worrier("dRam","Sharma",50,5));
		list.add(new Worrier("aVikas","Bhosle",40,2));
		list.add(new Worrier("eraju","Thakur",45,4));
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("Sort by fistname if first name same then sort by rank if rank same then sort by age in des. order");
		Collections.sort(list, new FirstNameComp());
		System.out.println(list);
	}
}
