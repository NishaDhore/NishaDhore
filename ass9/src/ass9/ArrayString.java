package ass9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayString 
{
	
	
		public static Map<String, Integer> CountLength(String [] str)
		{
			Map<String, Integer> map=new HashMap<>();
			
			for(String s:str) {
				map.put(s, s.length());			
			}
			return map;		
		}
		
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Size");
			int size=sc.nextInt();
			String[] NameArray=new String[size];
			
			
			System.out.println("Enter Values :");
			for(int i=0; i<NameArray.length; i++) 
			{
				NameArray[i]=sc.next();
			}
			for(int i=0; i<NameArray.length; i++) 
			{
				System.out.println(NameArray[i]);
			}
			
			Map map=CountLength(NameArray);
			System.out.println(map);
			
		}

	}


