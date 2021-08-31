import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.log4j.Logger;

public class DisplayID
{
	static Logger log = Logger.getLogger(Controller.class.getName()); 
	
	void displayId()
	{	
		log.debug("strat : displayId");
		try
		{
			Connection con=DBConnection.methodDBConnection();
			log.info("connection created...");
			if(con != null)
			{
				PreparedStatement ps=con.prepareStatement("select id from student");
				ResultSet rs=ps.executeQuery();
				
				
				while(rs.next())
				{
					int Id=rs.getInt("id");			
					
					System.out.println(Id);
				}
			}else {
				System.out.println("Connection fails.........");
				log.info("connection is not created...");
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
			log.error("error occured while displaying IDs");
			
		}
		
		log.debug("strat : displayId");
	}
	
		
}

