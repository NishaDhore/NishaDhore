package ass6;

import java.util.Scanner;

public class AccountMain
{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);

			boolean status = true;
			System.out.println("Welcome To Bank Account Services");
			System.out.println("Create Account :");
			createAccount createAccount = new createAccount();
			Account acc = createAccount.CreateAccount();

			do {
				System.out.println("please Enter Your Choice");

				System.out.println("Press 1: for deposit Balance");
				System.out.println("Press 2: for Display Balance");
				System.out.println("Press 3: for Compute and deposit interest");
				System.out.println("Press 4: for Withdraw Balance");
				System.out.println("Press 5: for Exit");

				int ch= sc.nextInt();
				switch (ch)
				{

				case 1:
					System.out.println("Your Balance is : "+acc.getBalance());
					System.out.println("Enter amount for Deposit :");
					double amt = sc.nextDouble();

					if (acc.getAccType().equalsIgnoreCase("Saving")) 
					{
						SavingAccount S = new SavingAccount();
						S.depositBalance(amt, acc);
					} 
					else
					{
						CurrentAccount CA = new CurrentAccount();
						CA.depositBalance(amt, acc);
					}
					
					System.out.println("After Deposit Your Balance is "+acc.getBalance());
					break;
					
				case 2:
					System.out.println("Your Account Balance is :" + acc.getBalance());
					break;
					
				case 3:
					if (acc.getAccType().equalsIgnoreCase("Saving"))
					{
						System.out.println("Enter Year :");
						int year = sc.nextInt();
						SavingAccount sa = new SavingAccount();
						sa.CompundInterest(year,acc);
						System.out.println("Current Balance with interest is" + acc.getBalance());
					}
					else
					{
						System.out.println("interest service is not for you Current Account. Thank You.");
					}
					break;
					
				case 4:

					System.out.println("your Balance is : "+acc.getBalance());
					System.out.println("Enter Amount for Withdraw :");
					double amt1 = sc.nextDouble();

					if (acc.getAccType().equalsIgnoreCase("Saving")) {
						SavingAccount SA = new SavingAccount();
						SA.WithdrawBalance(amt1, acc);
					} else {
						CurrentAccount CA = new CurrentAccount();
						CA.WithdrawBalance(amt1, acc);
					}
					System.out.println("Your Balance is"+acc.getBalance());
					break;
					
				case 5:
					status = false;
					break;
				}
			} while (status);
		}

	}

