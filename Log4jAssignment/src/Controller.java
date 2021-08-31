import org.apache.log4j.Logger;  
import java.io.*;  
import java.sql.SQLException;  
import java.util.*;  

public class Controller
{
	 static Logger log = Logger.getLogger(Controller.class.getName());  
	
	public static void main(String[] args) throws ClassNotFoundException, CloneNotSupportedException, IOException {
		
		FileReader reader = new FileReader("E:\\workspace2\\skillnet\\Log4jAssignment\\bin\\appp.properties");
		Properties p = new Properties();
		p.load(reader);
		//String msg=p.getProperty("msg");
		System.out.println("--------"+p.getProperty("msg")+"---------\n");
		
		
		log.debug("Hello this is a debug message");  
	    log.info("Hello this is an info message");  
		
	     
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		do {
			log.warn("you have to select any otion");
			System.out.println("\n1 : display student IDs : ");
			System.out.println("\n2 : display all students data : ");
			System.out.println("\n3 : check redundant data : ");
			System.out.println("\n4 : display hashcode : ");
			System.out.println("\n5 : insert clone data");
			System.out.println("\n6 : Exit");

			System.out.println("\n enter opton : ");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				DisplayID ob = new DisplayID();
				ob.displayId();
				break;

			case 2:
				DisplayAll ob1 = new DisplayAll();
				ob1.retrieveAndDisplayRecords();
				break;

			case 3:
				ReduandatData ob2 = new ReduandatData();
				ob2.checkRedundant();
				break;

			case 4:
				DisplayHashcode ob3 = new DisplayHashcode();
				ob3.getHashCode();
				break;

			case 5:
				InsertRecord ob5 = new InsertRecord();
				ob5.AddStudent();
				break;
				
			case 6:
				check = false;
				log.debug("Thank you");
				break;
			
			}

		} while (check);
		
		
		
	}
}
