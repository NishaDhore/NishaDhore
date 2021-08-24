package ass5;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class AddDetails
{

	void enterAccDetails(Account a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Account ID : ");
		a.AccId=sc.nextInt();
		System.out.println("Password : ");
		a.pass=sc.next();
		System.out.println("Account Name : ");
		a.AccName=sc.next();
		System.out.println("Middle Name : ");
		a.MiddleName=sc.next();
		System.out.println("Last Name : ");
		a.LastName=sc.next();
		System.out.println("Date Of Birth : ");
		a.DOB=sc.next();
		System.out.println("PAN : ");
		a.Pan=sc.next();
		System.out.println("Address : ");
		a.Address=sc.next();
		System.out.println("State : ");
		a.State=sc.next();
		System.out.println("City : ");
		a.City=sc.next();
		System.out.println("Zip Code : ");
		a.Zip=sc.nextInt();
		System.out.println("Account Balance : ");
		a.AccBal=sc.nextInt();
		
		 try {
	        	String filename="D:\\Account\\"+a.getAccName() + a.getLastName() + ".txt";
	            FileOutputStream fileOut = new FileOutputStream(filename);
	            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	            objectOut.writeObject(a);
	            objectOut.close();
	            System.out.println("Bank Account Details Write Successfully...!!!");	 
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }    
		
		
	}
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Account aa=new Account();
//		AddDetails ob=new AddDetails();
//		ob.enterAccDetails(aa);
//		ShowData s=new ShowData();
//		s.DisplayAccountDetails(aa);
//		
//		
//	}

}
