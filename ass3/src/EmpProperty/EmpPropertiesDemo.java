package EmpProperty;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class EmpPropertiesDemo 
{
	void sett() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter black listed employees Data");
		System.out.println("id :");
		String id = sc.next();
		System.out.println("First Name :");
		String fname = sc.next();
		System.out.println("Last Name : ");
		String lname = sc.next();
		
		Properties p = new Properties();
		p.setProperty("id", id);
		p.setProperty("firstName", fname);
		p.setProperty("lastname", lname);

		p.store(new FileWriter("E:\\\\workspace2\\\\skillnet\\\\ass3\\\\bin\\\\EmpProperty\\\\employees.properties"), "balck listed employee");

	}
	
	void gett() throws IOException
	{
		FileReader reader = new FileReader("E:\\workspace2\\skillnet\\ass3\\bin\\EmpProperty\\employees.properties");
		Properties p = new Properties();
		p.load(reader);

		System.out.println(p.getProperty("id"));
		System.out.println(p.getProperty("firstName"));
		System.out.println(p.getProperty("lastname"));
	}
	
	public static void main(String[] args) throws IOException
	{
		EmpPropertiesDemo ob=new EmpPropertiesDemo();
		ob.sett();
		ob.gett();
	}
	
}
