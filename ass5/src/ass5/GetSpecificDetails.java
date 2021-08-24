package ass5;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;



public class GetSpecificDetails 
{

	public Account getSepcificAccountDetails()
	{
		String filename;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name");
		String fname=sc.next();
		System.out.println("Enter your last name");
		String lname=sc.next();		
		filename=fname+lname+".txt";
		
		Account acc=new Account();

		try {
			System.out.println(filename);
			FileInputStream fileInput = new FileInputStream("D:\\Account\\" + filename);
			ObjectInputStream objectIn = new ObjectInputStream(fileInput);
			acc = (Account) objectIn.readObject();
			// show information
			ShowData sd = new ShowData();
			sd.DisplayAccountDetails(acc);
			System.out.println("Data Read Successfully...!!!");
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	return acc;
	}

	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		GetSpecificDetails ob=new GetSpecificDetails();
//		
//		ob.getSepcificAccountDetails();
//	}

}
