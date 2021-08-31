import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class DBConnection 
{
	static Logger log = Logger.getLogger(Controller.class.getName()); 
	
	
	private static Connection con;
	
	static Connection methodDBConnection() throws ClassNotFoundException, SQLException, IOException
	{
		log.debug("Start: methodDBConnection ");  
		
		Connection con = null;
		
		try
		{
			FileReader reader = new FileReader("E:\\workspace2\\skillnet\\Log4jAssignment\\bin\\appp.properties");
			Properties p = new Properties();
			p.load(reader);
			
			String classname=p.getProperty("classname");
			String url=p.getProperty("url");
			String user=p.getProperty("user");
			String pass=p.getProperty("pass");
		
			
			Class.forName(classname);
			log.info("Driver Class is Loaded");
			con=DriverManager.getConnection(url,user,pass);
			log.info("Connection Established....");
				
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			log.error("connection problem..."+e.getMessage());
		}
		
		
		log.debug("End : methodDBConnection");
		return con;	
		
	}
	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
//		DBConnection a=new DBConnection();
//		a.methodDBConnection();
//		
//	}
//	
}
