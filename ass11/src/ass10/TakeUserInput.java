package ass10;

import java.util.ArrayList;
import java.util.Scanner;

public class TakeUserInput
{
	
		public ArrayList<Integer> UserInput()
		{
			 ArrayList<Integer> userInput = new ArrayList<>();
		        int tempInput;
		        int count = 1;
		        boolean shouldAddToUserInput;
		        
		        Scanner sc = new Scanner(System.in);
		        do{
		            try{
		                System.out.println("\n Enter " + count + "number ");
		                tempInput = sc.nextInt();  
		                shouldAddToUserInput = true;
		                
		                // to avoid duplicates number
		                for(int i = 0; i < userInput.size(); i++)
		                {
		                    if (userInput.get(i) == tempInput) { 
		                    	shouldAddToUserInput = false;
		                        break;
		                    }
		                }
		                // after confirming not duplicate then add number to list
		                if (shouldAddToUserInput && tempInput < 50 && tempInput > 0)
		                { 
		                    userInput.add(tempInput);
		                    count++;
		                }
		                else
		                {
		                    System.out.println("Invalid Input, Try Again"); 
		                }
		                if(count > 6) 
		                	break;
		            }
		            catch (Exception e) 
		            {
		                System.out.println("Invalid Input..... Only Integer Numbers Allowed. Try Again \n"); 
		                sc.nextLine(); //
		            }

		        }while(true);
		        return userInput;
		}

	}


