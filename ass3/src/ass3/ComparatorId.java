package ass3;

import java.util.Comparator;

public class ComparatorId implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.getId()-o1.getId();
	}

}
