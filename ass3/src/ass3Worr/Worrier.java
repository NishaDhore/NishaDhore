package ass3Worr;

public class Worrier implements Comparable<Worrier> {
	String firstname;
	String lastname;
	int age;
	int rank;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Worrier(String firstname, String lastname, int age, int rank) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "\n Worrier [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", rank=" + rank + "]";
	}

	@Override
	public int compareTo(Worrier o) {
		// TODO Auto-generated method stub
		return rank - o.getRank();
	}

}
