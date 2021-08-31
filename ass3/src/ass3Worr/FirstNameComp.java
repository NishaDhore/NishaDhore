package ass3Worr;

import java.util.Comparator;

public class FirstNameComp implements Comparator<Worrier> {

	@Override
	public int compare(Worrier o1, Worrier o2) {

		if (o1.getRank() == o2.getRank()) {
			return o2.getAge()-(o1.getAge());
		}

		if (o1.getFirstname().equals(o2.getFirstname())) {
			return o1.getRank() - (o2.getRank());
		} else
			return o1.getFirstname().compareTo(o2.getFirstname());
	}

}
