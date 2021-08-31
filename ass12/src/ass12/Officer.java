package ass12;

public class Officer extends Staff {

	private String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Officer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Officer(int code, String name) {
		super(code, name);
		// TODO Auto-generated constructor stub
	}

	public Officer(int code, String name, String grade) {
		super(code, name);
		this.grade = grade;
	}

}
