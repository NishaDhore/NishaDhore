
public class Student implements Cloneable {

	int studentId;
	String studentFirstName;
	String studentLastName;
	int studentAge;
	String studentDOB;
	
	
	
	
	public Student(int studentId, String studentFirstName, String studentLastName, int studentAge, String studentDOB) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentAge = studentAge;
		this.studentDOB = studentDOB;
	}
	
	
	public Object clone(Student student)throws CloneNotSupportedException{  
		return super.clone();  
		}  
	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(String studentDOB) {
		this.studentDOB = studentDOB;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentLastName="
				+ studentLastName + ", studentAge=" + studentAge + ", studentDOB=" + studentDOB + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentAge;
		result = prime * result + ((studentDOB == null) ? 0 : studentDOB.hashCode());
		result = prime * result + ((studentFirstName == null) ? 0 : studentFirstName.hashCode());
		result = prime * result + studentId;
		result = prime * result + ((studentLastName == null) ? 0 : studentLastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentAge != other.studentAge)
			return false;
		if (studentDOB == null) {
			if (other.studentDOB != null)
				return false;
		} else if (!studentDOB.equals(other.studentDOB))
			return false;
		if (studentFirstName == null) {
			if (other.studentFirstName != null)
				return false;
		} else if (!studentFirstName.equals(other.studentFirstName))
			return false;
		if (studentId != other.studentId)
			return false;
		if (studentLastName == null) {
			if (other.studentLastName != null)
				return false;
		} else if (!studentLastName.equals(other.studentLastName))
			return false;
		return true;
	}

	

	
	
	
	
	
	
	

}
