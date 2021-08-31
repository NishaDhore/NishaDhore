import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class ReduandatData {
	
	static Logger log = Logger.getLogger(Controller.class.getName()); 
	
	void checkRedundant()
	{
		log.debug("start : ReduandatData");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your student id");
		int id = sc.nextInt();
		Student s = null;

		try {
			Connection con = DBConnection.methodDBConnection();
			log.info("connection created...");
			if (con != null) {

				PreparedStatement ps1 = con.prepareStatement("select * from student where id=?");
				ps1.setInt(1, id);
				ResultSet rs1 = ps1.executeQuery();
				while (rs1.next()) {
					int Id = rs1.getInt("id");
					String Firstname = rs1.getString("firstname");
					String Lastname = rs1.getString("lastname");
					int Age = rs1.getInt("age");
					String DOB = rs1.getString("dob");

//					System.out.println("id:" + Id);
//					System.out.println("first name:" + Firstname);
//					System.out.println("last name:" + Lastname);
//					System.out.println(Age);
//					System.out.println(DOB);
					s = new Student(Id, Firstname, Lastname, Age, DOB);
					System.out.println(s);

				}

				ArrayList<Student> list = new ArrayList();

				PreparedStatement ps = con.prepareStatement("select * from student");
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					int Id1 = rs.getInt("id");
					String Firstname1 = rs.getString("firstname");
					String Lastname1 = rs.getString("lastname");
					int Age1 = rs.getInt("age");
					String DOB1 = rs.getString("dob");

					Student ls = new Student(Id1, Firstname1, Lastname1, Age1, DOB1);
					list.add(ls);

				}

				
				ArrayList<Student> list1=new ArrayList<Student>();
				for (int i = 0; i < list.size(); i++)
				{
					if (s.equals(list.get(i)))
					{
						list1.add(list.get(i));
					}
				}
				
				if(list1.size() >1 )				
					System.out.println(list1);
				else
					System.out.println("Not found!!!");

				
				
			} else {
				System.out.println("Connection fails.........");
				log.info("connection is not created...");
			}

		} catch (Exception e) {
			System.out.println(e);
			log.error("error occured while checking redundant data");
		}
		
		log.debug("End : ReduandatData");
	}

	
}
