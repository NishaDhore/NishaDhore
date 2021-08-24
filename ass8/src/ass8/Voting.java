package ass8;

import java.io.*;
import java.util.Scanner;

public class Voting {
	public static void main(String args[])
	{

		int Candidate[] = new int[6];
		int SpoiltBallot = 0;
		int voters;
		// int check = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("\n---------ELECTION BOARD---------\n");
		System.out.print("\nEnter number of voters appeared for voting :");
		voters = sc.nextInt();

		loop:for (int i = 1; i <= voters; i++) 
			{
				System.out.println("Vote Given By voter" + i + " to Candidate :");
				int tempvote = sc.nextInt();
	
				if (tempvote > 0 && tempvote < 6)
				{
					Candidate[tempvote] = Candidate[tempvote] + 1;
	
				} else 
				{
					SpoiltBallot++;
					i--;
					System.out.println("Candidate Invalid... Please Enter Valid Candidate id");
					continue loop;
				}
			}
		System.out.println("-----------Election Result-------------");

		for (int j = 1; j < Candidate.length; j++) 
		{
			System.out.println("Candiate " + j + " Vote Count :" + Candidate[j]);
		}

		System.out.println("SpoiltBallot Vote :" + SpoiltBallot);
	}
}
