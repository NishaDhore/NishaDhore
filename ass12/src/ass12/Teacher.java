package ass12;

public class Teacher extends Staff {
	private String Subject;
	private String Publiction;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Teacher(int code, String name, String subject, String publiction) {
		super(code, name);
		Subject = subject;
		Publiction = publiction;
	}
	
	
	public Teacher(int code, String name) {
		super(code, name);
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getPubliction() {
		return Publiction;
	}
	public void setPubliction(String publiction) {
		Publiction = publiction;
	}

	

}
