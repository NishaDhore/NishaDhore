
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class InsertRecord {
	
	static Logger log = Logger.getLogger(Controller.class.getName()); 
	
	public void AddStudent() throws ClassNotFoundException, CloneNotSupportedException, IOException 
{
		
		log.debug("start : AddStudent");
	try {
		Connection con=DBConnection.methodDBConnection();
		log.info("connection created...");
			
		
		//all data
/*		ArrayList<Student> list = new ArrayList<Student>();

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
		}*/
		
		
		// inserting data
				Scanner sc=new Scanner(System.in);
				System.out.println("enter Id:");
				int id=sc.nextInt();
				System.out.println("enter first name:");
				String fn=sc.next();
				System.out.println("enter last name:");
				String ln=sc.next();
				System.out.println("enter age:");
				int age=sc.nextInt();
				System.out.println("enter Date of birth (dd/mm/yyyy):");
				String date=sc.next();
				
//				Student s=new Student(id, fn, ln, age, date);
				
				PreparedStatement ps1=con.prepareStatement("insert into student values(?,?,?,?,?)");
				ps1.setInt(1,id);
				ps1.setString(2, fn);
				ps1.setString(3, ln);
				ps1.setInt(4, age);
				ps1.setString(5, date);
				
				int result=ps1.executeUpdate();
				
				if(result>0)
				{
					System.out.println("Record insert successfully...!!!");
				}
				else
				{
					System.out.println("Record Not Inserted...");
				}
				
			
				
		
	/*	for (int i = 0; i < list.size(); i++)
		{
			if (s.equals(list.get(i)) )
			{
				list.add(list.get(i));
				PreparedStatement ps1=con.prepareStatement("insert into student values(?,?,?,?,?)");
				ps1.setInt(1,id);
				ps1.setString(2, fn);
				ps1.setString(3, ln);
				ps1.setInt(4, age);
				ps1.setString(5, date);
				
				int result=ps1.executeUpdate();
				
				if(result>0)
				{
					System.out.println("Record insert successfully...!!!");
				}
				else
				{
					System.out.println("Record Not Inserted...");
				}
				
				
				System.out.println("clone added");
				
			}else
			{
				System.out.println("data you are inserting is not a clone of an existing data.");
			}
		}*/
		
	} catch (SQLException e) {
		e.printStackTrace();
		log.error("Error occured while inserting "+e.getMessage());
	}	
	
	log.debug("End : AddStudent");
}

//public static void main(String[] args) throws ClassNotFoundException, CloneNotSupportedException, IOException {
//	InsertRecord ob=new InsertRecord();
//	ob.AddStudent();
//}

}
