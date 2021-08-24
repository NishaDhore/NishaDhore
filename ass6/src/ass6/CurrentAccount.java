package ass6;

import java.util.Scanner;

public class CurrentAccount extends Account
{
		
	public void WithdrawBalance(double balance, Account acc)
	{
		double resultbal=acc.getBalance()-balance;
		if(resultbal<=500)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Balance low!!! do you want to continue ? ");
			System.out.println("Some Charge Will be Applied");
			System.out.println("press y for Yes | press n for No");
			String ch=sc.next();
			if(ch.equalsIgnoreCase("y"))
			{
				resultbal=resultbal-50;
				acc.setBalance(resultbal);
			}
			else
			{
				System.out.println("WithDraw Canceled...");
			}			
		}
	}
	
	public void CheckBook()
	{
		System.out.println("Check Book Facility Available...");

	}
	
	public void depositBalance(double balance,Account acc)
	{
		acc.setBalance(acc.getBalance()+balance);
	}
	
	
}
