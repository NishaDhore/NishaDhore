package ass12;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffDatabase
{


	public static void TeacherStaffDatabase()
	{		
		Teacher tec = new Teacher();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------Enter Techer Staff Data-------");
		System.out.println("Enter Code :");
		tec.setCode(sc.nextInt());
		System.out.println("Enter Name");
		tec.setName(sc.next());
		System.out.println("Enter Subject");
		tec.setSubject(sc.next());
		System.out.println("Enter Publication");
		tec.setPubliction(sc.next());
		
		ArrayList<Teacher> teacher = new ArrayList<Teacher>();
		teacher.add(tec);

		for (Teacher t : teacher)
		{
			System.out.println(t.getCode());
			System.out.println(t.getName());
			System.out.println(t.getSubject());
			System.out.println(t.getPubliction());
		}
	}

	public static void RegularTypistStaffDatabase()
	{
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------Enter Regular Typist Staff Data-------");
		System.out.println("Enter Code :");
		int code = sc.nextInt();
		System.out.println("Enter Name :");
		String name = sc.next();
		System.out.println("Enter Speed :");
		int speed = sc.nextInt();
		Regular regular = new Regular(code, name, speed);
		
		ArrayList<Regular> regularTypistStaff = new ArrayList<Regular>();
		regularTypistStaff.add(regular);

		for (Regular t : regularTypistStaff) {
			System.out.println(t.getCode());
			System.out.println(t.getName());
			System.out.println(t.getSpeed());
		}

	}

	public static void casualTypistStaffDatabase() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------Enter Casual Typist Staff Data---------");
		System.out.println("Enter code :");
		int code = sc.nextInt();
		System.out.println("Enter Name :");
		String name = sc.next();
		System.out.println("Enter Speed :");
		int speed = sc.nextInt();
		System.out.println("Enter Daily Wages :");
		double dailyWages = sc.nextDouble();
		
		ArrayList<Casual> casualTypistStaff = new ArrayList<Casual>();
		Casual casual = new Casual(code, name, speed, dailyWages);
		casualTypistStaff.add(casual);
		
		for(Casual c:casualTypistStaff) {
			System.out.println(c.getCode());
			System.out.println(c.getName());
			System.out.println(c.getSpeed());
			System.out.println(c.getDailyWages());
		}
	}
	
	public static void offierStaffDatabase()
	{
		Officer officer=new Officer();
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-------------Enter Officer Staff Data------------");
		System.out.println("Enter Code :");
		officer.setCode(sc.nextInt());
		System.out.println("Enter Name :");
		officer.setName(sc.next());
		System.out.println("Enter Grade :");
		officer.setGrade(sc.next());
		
		ArrayList<Officer> officerStaffs=new ArrayList<Officer>();
		officerStaffs.add(officer);
		
		
		for(Officer t : officerStaffs) 
		{
			System.out.println(t.getCode());
			System.out.println(t.getName());
			System.out.println(t.getGrade());
		}
	}

	
	public static void main(String[] args)
	{
		TeacherStaffDatabase();
		RegularTypistStaffDatabase();
		casualTypistStaffDatabase();
		offierStaffDatabase();

	}
}
