package ass5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 to add Account details");
		System.out.println("enter 2 to show Account details");
		System.out.println("enter choice:");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		
		case 1:
			Account aa=new Account();
			AddDetails ob=new AddDetails();
			ob.enterAccDetails(aa);
			ShowData s=new ShowData();
			s.DisplayAccountDetails(aa);
			break;
		case 2:
			GetSpecificDetails ob1=new GetSpecificDetails();
			ob1.getSepcificAccountDetails();
			break;
		default:
			System.out.println("enter right choice:");
			break;
			
		}

	}

}
