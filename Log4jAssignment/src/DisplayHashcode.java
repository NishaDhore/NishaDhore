import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class DisplayHashcode {

	 Logger log = Logger.getLogger(Controller.class.getName()); 
	
	void getHashCode()
	{	log.debug("start : getHashCode ");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id to check hashcode");
		int id=sc.nextInt();
		
		Student s=null;
		try
		{
		
		Connection con=DBConnection.methodDBConnection();
		log.info("connection created...");
		if(con != null)
		{
			PreparedStatement ps=con.prepareStatement("select * from student where id="+id);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				int Id=rs.getInt("id");			
				String Firstname=rs.getString("firstname");
				String Lastname=rs.getString("lastname");
				int Age=rs.getInt("age");
				String DOB=rs.getString("dob");
				
				 s=new Student(Id, Firstname, Lastname, Age, DOB)	;
				
			}
		}else {
			System.out.println("Connection fails.........");
			log.info("connection not created..");
		}
		
		System.out.println(s.hashCode());
		
		}catch(Exception e)
		{
			System.out.println(e);
			log.error("Error occured while displaying hashcode"+e.getMessage());
		}
		
		log.debug("End : getHashCode ");
	}
	
	
	
	

}
