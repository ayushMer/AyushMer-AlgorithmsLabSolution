package service;

public class TargetAchievementCalculator {

	public int targetCheck(int[] transactionsArr, int transactionSize,
			int target) {
		// TODO Auto-generated method stub
		int tempTarget=target;
		int numberOfTransactions=0;
		boolean targetAchieved=false;
		
		for(int i=0;i<transactionSize;i++)
		{
			tempTarget=tempTarget-transactionsArr[i];
			
			if(tempTarget<=0)
			{
				numberOfTransactions=i+1;
				targetAchieved=true;
				break;
			}
			
		}
		if(targetAchieved==false)
			return -1;
		return numberOfTransactions;
	}
}
