package ass6;

import java.util.Scanner;

public class createAccount
{
	public Account CreateAccount() 
	{
		Account acc=new Account();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Account Number : ");
		acc.setAccId(sc.nextInt());
		System.out.println("Enter Name : ");
		acc.setName(sc.next());
		System.out.println("Enter Account Type SAVING OR CURRENT");
		acc.setAccType(sc.next());
		System.out.println("Enter Balance :");
		acc.setBalance(sc.nextDouble());
		if(!acc.equals(null))
		{
			System.out.println("Account Created Successfully...");
		}
		else
		{
			System.out.println("Ohhhh!!!!Account Not Created...");
		}
		return acc;
	}
}
