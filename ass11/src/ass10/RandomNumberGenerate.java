package ass10;


import java.util.ArrayList;
import java.util.Random;
public class RandomNumberGenerate 
{

		public ArrayList<Integer> createRandomLottery() {
			Random randomNumber = new Random();
			int tempNumber;
			boolean addNumberToList;
			ArrayList<Integer> randomLotteryNumber = new ArrayList<>();
			do {
				addNumberToList = true;
				tempNumber = randomNumber.nextInt(50)+1; // tempNumber stores random number
				for (int j = 0; j < randomLotteryNumber.size(); j++) {
					if (randomLotteryNumber.get(j) == tempNumber) { 
						addNumberToList = false;
					
						break;
					}
				}
				if (addNumberToList)
					randomLotteryNumber.add(tempNumber); 
				
			} while (randomLotteryNumber.size() < 6);
			return randomLotteryNumber;
		}

}



