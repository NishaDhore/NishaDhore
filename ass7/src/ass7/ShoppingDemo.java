package ass7;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class ShoppingDemo {


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
				Scanner sc = new Scanner(System.in);
				boolean status = true;
				
				//adding value in list
				Vector<String> shopingList = new Vector<String>();
				System.out.println("Enter Shopping Item List: ");
				for (int i = 0; i < 5; i++)
				{
					shopingList.add(sc.next());
				}
				
				 while (status)
				{
					System.out.println("--------Select your option---------  :");
					System.out.println("Press 1: for See Vector List");
					System.out.println("Press 2: for Delete Item");
					System.out.println("Press 3: for add Item at Specific Location");
					System.out.println("press 4: for add element at last");
					System.out.println("Press 5: exit");
					int ch = sc.nextInt();
					switch (ch) {
					
					case 1:
					
						Enumeration e = shopingList.elements();
						while (e.hasMoreElements())
						{
							System.out.println(e.nextElement());
						}
					break;
						
					case 2:
						System.out.println("Enter item name");
						String item = sc.next();
						shopingList.remove(item);
						System.out.println("Item Delete Successfully");
						System.out.println(shopingList);
						break;
					case 3:
						System.out.println("Enter item Name");
						String newItem = sc.next();
						System.out.println("Enter Index");
						int index = sc.nextInt();
						shopingList.insertElementAt(newItem, index);
						System.out.println(shopingList);
						break;
					case 4:
						System.out.println("Enter item Name");
						String Item = sc.next();
						shopingList.addElement(Item);
						System.out.println(shopingList);
						break;
					case 5:
						return;
					default:
						status = false;
						break;
					}
				}
		

	}

}
