package ass5atm;


import java.io.ObjectOutputStream;
import java.util.Scanner;
import ass5.Account;
import ass5.GetSpecificDetails;
import ass5.ShowData;

public class ATMMain {

	public static void main(String args[]) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Account Id to login");
		int AccountId = sc.nextInt();
		System.out.println("Enter your Account Password");
		String pass = sc.next();
		boolean status = true;
		
		
		GetSpecificDetails gg=new GetSpecificDetails();
		Account acc=gg.getSepcificAccountDetails();
		

		if (pass.equalsIgnoreCase(acc.getPass()) )
		{
			System.out.println("Login Successfully...");
			do {
//				
				System.out.println("Press 1 : Checking Balance:");
				System.out.println("Press 2 : Change Password");
				System.out.println("Press 3 : Check Account Deatils");
				System.out.println("Press 4 : Withdraw Amount");
				System.out.println("Press 5 : Deposit Amount");
				System.out.println("Press 6 : exit");
				System.out.println("Enter Your Choice");
				int ch = sc.nextInt();
				
				switch (ch)
				{
				case 1:
					System.out.println("Balance :" + acc.getAccBal());
					break;
					
				case 2:
					
					System.out.println("Enter New Password to change");
					String newPass = sc.next();
					acc.setPass(newPass);

					UpdateAccount u=new UpdateAccount();
					u.UpdateData(acc);
					break;
					
				case 3:
					ShowData sd=new ShowData();
					sd.DisplayAccountDetails(acc);
					break;
					
				case 4:
					WithdrawAccount wd=new WithdrawAccount();
					wd.withdrawAmount(acc);
					
					break;
					
				case 5:
					
					 DepositeAccount da = new  DepositeAccount();
					 da.DepositeAmount(acc);
					
					break;
					
				case 6:
					status = false;
					break;
					
				default:
					System.out.println("Invalid Choice");
					status = false;
					break;
				}
			} while (status);
		}
		else
		{
			System.out.println("Login Failed");
		}
	}
}
