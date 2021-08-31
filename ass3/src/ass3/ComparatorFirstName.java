package ass3;

import java.util.Comparator;

public class ComparatorFirstName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.getLastname().equals(o2.getLastname())) {
			return o1.getFirstname().compareTo(o2.getFirstname());

		} else {
			return o2.getLastname().compareTo(o1.getLastname());
		}

	}
}