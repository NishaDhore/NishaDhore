import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class DisplayAll {

	static Logger log = Logger.getLogger(Controller.class.getName()); 
	
	void retrieveAndDisplayRecords()
	{
		log.debug("strat : retrieveAndDisplayRecords");
		try
		{
		
		Connection con=DBConnection.methodDBConnection();
		log.info("connection created...");
		if(con != null)
		{
			PreparedStatement ps=con.prepareStatement("select * from student");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				int Id=rs.getInt("id");			
				String Firstname=rs.getString("firstname");
				String Lastname=rs.getString("lastname");
				int Age=rs.getInt("age");
				String DOB=rs.getString("dob");
				
				System.out.println("id"+Id);
				System.out.println("first name:"+Firstname);
				System.out.println("last name:"+Lastname);
				System.out.println(Age);
				System.out.println(DOB);
				System.out.println("------------------");
				log.warn("All data should be get using getString() method");
				
			}
		}else {
			System.out.println("Connection fails.........");
			log.info("connection is not created...");
		}
		
		
		}catch(Exception e)
		{
			System.out.println(e);
			log.error("error occured while displaying records");
		}
		log.debug("End : retrieveAndDisplayRecords");
	}
	
	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException
//	{
////		RetrieveAndDisplay ob=new RetrieveAndDisplay();
////		ob.retrieveAndDisplayRecords();
//	}
	
}
