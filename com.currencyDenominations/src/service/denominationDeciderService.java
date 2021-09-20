package service;

public class denominationDeciderService {

	public void calculateNotes(int amountToPay,int[] currencyDenominatons,int sizeOfCurrencyDenomination) {
		
		int tempAmount=amountToPay;
		int tempDen=0;
		int reqDenomination=0;
		String possibleNotes="";
		boolean exceptionflag=false;
		
		try{
		for(int i=sizeOfCurrencyDenomination-1;i>=0;i--)
		{
			tempDen=currencyDenominatons[i];
			if(tempAmount>=tempDen && tempAmount!=0)
				{
				reqDenomination=tempAmount/tempDen;
				
				tempAmount=tempAmount%tempDen;
			
				possibleNotes=possibleNotes+tempDen+":"+reqDenomination+"\n";
				
				}
		
		}
	}
	catch(Exception e)
		{
			System.out.println("Arithemetic Exception, division by 0");
			exceptionflag=true;
		}

		if(exceptionflag==false){
			
		if(tempAmount==0){
			System.out.println("Your payment approach in order to give min no of notes will be");
			System.out.println(possibleNotes);}
		else
		{
			System.out.println("Not possible combination of notes in given currency");
		}
	 }
  }
}
