package ass10;

import java.util.ArrayList;

public class CheckLotteryMatch
{
		
		public ArrayList<Integer> checkLottryMatch(ArrayList<Integer> userInput, ArrayList<Integer> randomLotteryNumber)
		{
			
			ArrayList<Integer> LotteryMatch=new ArrayList<Integer>();
			
			for(int i=0;i<randomLotteryNumber.size();i++) 
			{
				for(int j=0;j<userInput.size();j++)
				{
					if(randomLotteryNumber.get(j)==userInput.get(i))
					{
						LotteryMatch.add(randomLotteryNumber.get(j));
						break;
					}
				}
			}
			
			return LotteryMatch;
		}

}



