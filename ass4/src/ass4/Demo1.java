package ass4;

import java.util.Scanner;

public class Demo1 extends Demo
{
	int id=112233;
	int Age;
	
//	void details()
//	{
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("enter ant no to genetrate id:");
//		id=sc.nextInt();
//		
//	}
//	
	
	
	static public void generateId()
	{
		int id1=112233;
		id1=11+id1;
		System.out.println(id1);
	}
	
	public void generateId(int value)
	{
		id=value+id+Age;
		System.out.println(id);
	}
	
	public void generateId(char c)
	{
		id=(int)c+id+(int)Age;
		System.out.println(id);
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo ob=new Demo();
		ob.generateId();
		ob.generateId(10001);
		ob.generateId('z');
		
		System.out.println("--------------");
		Demo1 ob1=new Demo1();
		ob1.generateId();
		ob1.generateId(77);
		ob1.generateId('x');
		
		
		System.out.println("-------");
		Demo o=new Demo1();
		o.generateId();
	}

}
