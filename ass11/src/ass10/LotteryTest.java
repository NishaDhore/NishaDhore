package ass10;
import java.util.ArrayList;

public class LotteryTest
{
		public static void main(String[] args)
		{
			
			//lottery number between 1-49
			
				TakeUserInput TUI = new TakeUserInput();
			 	ArrayList<Integer> userInput = TUI.UserInput();
			 	System.out.println("Your Selected Number:"+ userInput);
			 	
			 	// Call Random Lottery Number
			 	RandomNumberGenerate numberGenerate = new RandomNumberGenerate();
			 	ArrayList<Integer> randomLotteryNumber = numberGenerate.createRandomLottery();
		        System.out.println("Lucky Numbers were: " + randomLotteryNumber);
		        
		        CheckLotteryMatch lotteryMatch=new CheckLotteryMatch();
		        ArrayList<Integer> match=lotteryMatch.checkLottryMatch(userInput, randomLotteryNumber);
		        
		        if(match.size()==6) {
		        	System.out.println("Congratulations you got JACKPOT !!!");
		        }else if(match.size()>0) {
		        	System.out.println("Congratulations You got "+match.size()+" Lottery Matches");
		        	System.out.println(match);
		        }else {
		        	System.out.println("Sorry you Lost...Better Luck Next Time  !!!");
		        }
			
		}

}


