package main;

import java.util.*;
import service.TargetAchievementCalculator;

public class Driver {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int transactionSize=sc.nextInt();
		
		int transactionsArr[]=new int[transactionSize];
		
		System.out.println("Enter the values of array");
		for(int i=0;i<transactionSize;i++)
			transactionsArr[i]=sc.nextInt();
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int totalTargets=sc.nextInt();
		
		TargetAchievementCalculator service=new TargetAchievementCalculator();
		for(int i=0;i<totalTargets;i++)
		{
			//call service function for each target value
			System.out.println("Enter the value of the target");
			int target=sc.nextInt();
			int numberOfTransactions=service.targetCheck(transactionsArr,transactionSize,target);
			
			if(numberOfTransactions==-1)
				System.out.println("Given target is not achieved");
			else
				System.out.println("Target achieved after "+numberOfTransactions+" transactions");
			
			System.out.println();
		}
		
		sc.close();
	}
}
