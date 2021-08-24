package ass5atm;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import ass5.Account;

public class UpdateAccount 
{
	public void UpdateData(Account aa)
	{
	try
	{
		String filename = "D:\\Account\\" + aa.getAccName() + aa.getLastName() + ".txt";
		FileOutputStream fos = new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(aa);
		oos.close();
		System.out.println("Record Updated Successfully...!!!");
	} 
	catch (Exception ex)
	{
		ex.printStackTrace();
	}
}
}
