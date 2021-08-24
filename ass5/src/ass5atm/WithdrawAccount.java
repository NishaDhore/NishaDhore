package ass5atm;

import java.util.Scanner;

import ass5.Account;

public class WithdrawAccount 
{
	void withdrawAmount(Account acc)
	{
		
		System.out.println("Your Current Balance is :" + acc.getAccBal());
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr WithDraw Amount :");
		int withdrawAmt = sc.nextInt();
		int balance = (int) (acc.getAccBal() - withdrawAmt);
		if (balance >= 500)
		{
			acc.setAccBal(balance);
			
			UpdateAccount ua1 = new UpdateAccount();
			ua1.UpdateData(acc);
		}
		else
		{
			System.out.println("Withdraw Failed...");
			System.out.println("Possible Reason \n 1) Low Balance \n 2) Something Went Wrong");
		}
	}
	
}
