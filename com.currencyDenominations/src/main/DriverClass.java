package main;

import java.util.Arrays;
import java.util.Scanner;

import service.denominationDeciderService;
import utilities.MergeSort;


public class DriverClass {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the size of currency denominations");
		int sizeOfCurrencyDenomination=sc.nextInt();
		
		int currencyDenominatons[]=new int[sizeOfCurrencyDenomination];
		
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<sizeOfCurrencyDenomination;i++)
			currencyDenominatons[i]=sc.nextInt();
		
		System.out.println("Enter the amount you want to pay");
		int amountToPay=sc.nextInt();
		
		
		//Sorting the array
		 MergeSort sort=new MergeSort();
		 sort.sortArray(currencyDenominatons,0,sizeOfCurrencyDenomination-1);
		 
		//Calling service function
		 denominationDeciderService service=new denominationDeciderService();
		 service.calculateNotes(amountToPay,currencyDenominatons,sizeOfCurrencyDenomination);
		 
		 
		 sc.close();
		 
		 
		 
		
	}
}
