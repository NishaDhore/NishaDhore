package ass6;

import java.util.Scanner;

public class SavingAccount extends Account
{
	
	public void CompundInterest(int year, Account acc)
	{
		double intrest = acc.getBalance() * (Math.pow((1 + 0.10), year) - 1);
		acc.setBalance(acc.getBalance() + intrest);
	}

	public void WithdrawBalance(double balance, Account acc)
	{
		double result = acc.getBalance() - balance;
		if (result <= 500)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Balance low!!!\n do want to continue ?");
			System.out.println("Some Charge Will be Applied");
			System.out.println("press y for Yes OR press n for No");
			String ch = sc.next();
			if (ch.equalsIgnoreCase("y"))
			{
				result = result - 50;
				System.out.println("Rs. 50 charge Applied");
				acc.setBalance(result);
			}
			else if (ch.equalsIgnoreCase("n"))
			{
				System.out.println("Withdraw Canceled");
			}
		} 
		else
		{
			acc.setBalance(result);
		}
	}

	public void depositBalance(double balance, Account acc) 
	{
		acc.setBalance(acc.getBalance() + balance);
	}

	
	
	
}
