package ass5atm;

import java.util.Scanner;

import ass5.Account;

public class DepositeAccount
{
	void DepositeAmount(Account acc)
	{
		
		System.out.println("Your Current Balance is :" + acc.getAccBal());
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Deposit Amount :");
		int deposit = sc.nextInt();
		int balance2 = (int) (acc.getAccBal() + deposit);
		acc.setAccBal(balance2);
		
		UpdateAccount ua3=new UpdateAccount();
		ua3.UpdateData(acc);
	}
}
