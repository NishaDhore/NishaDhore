package ass5;



public class ShowData
{
	public void DisplayAccountDetails(Account aa) {
		
		System.out.println("Account Id:"+aa.getAccId());
		System.out.println("Account Password:"+aa.getPass());
		System.out.println("Account Holder Name ="+aa.getAccName() +" "+ aa.getMiddleName() +" "+aa.getLastName());
		System.out.println("Account Date of Birth:"+aa.getDOB());
		System.out.println("Account PAN:"+aa.getPan());
		System.out.println("Account Address:"+aa.getAddress());
		System.out.println("Account State:"+aa.getState());
		System.out.println("Account City:"+aa.getCity());
		System.out.println("Account ZipCode:"+aa.getZip());
		System.out.println("Account Account Balance:"+aa.getAccBal());
	}

}
