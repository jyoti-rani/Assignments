import java.text.DecimalFormat;
import java.util.Scanner;

public class Depreciation {
	
	static DecimalFormat twoDForm = new DecimalFormat("#.00"); //to round of the cost to two decimal places

	public void calculateDepreciation(){
		Scanner S = new Scanner(System.in);
		System.out.println("Please provide below details of the item:");
		System.out.print("Description: ");
		String DESC = S.next();
		System.out.print("Year of purchase: ");
		int YEAR = S.nextInt();
		System.out.print("Cost : ");
		double COST = S.nextDouble();
		System.out.print("Estimated Life: ");
		int LIFE = S.nextInt();
		
		System.out.print("Method of depreciation(Double-Declining/Single-Declining): ");
		String METHOD = S.next();
		if (METHOD.equals("Single-Declining")){ // Call Straight-Line method 
			SingleDep(YEAR,COST,LIFE);
		}
		else if (METHOD.equals("Double-Declining")){ // Call Double-Declining method
			DoubleDep(YEAR,COST,LIFE);
		}
		else{
			System.out.println("Not a valid choice of depreciation method. Try again Later !!"); // control returns back to main method
		}
		return;	
	}

	public static void SingleDep(int YEAR, double COST, int LIFE){
		int currentYear = YEAR;
		double depAmt = COST/LIFE; // With the straight line method of depreciation, each year the item depreciates by 1/nth of its original value. Here n is the no. of years. 
		double TotalDep = 0;
		System.out.println("Year		Cost		Dep. Amt	Total Dep.");
		for (int i=0 ; i<LIFE ; i++ ){
			TotalDep = TotalDep+depAmt;
			System.out.println(currentYear+ "		" +twoDForm.format(COST)+ "		" +twoDForm.format(depAmt)+ "		" +twoDForm.format(TotalDep));
			currentYear++;
		}
	
	}
	public static void DoubleDep(int YEAR, double COST, int LIFE){
		int currentYear = YEAR;
		double currentCost = COST;
		double TotalDep = 0;
		System.out.println("Year		Cost		Dep. Amt	Total Dep.");
		for (int i=0 ; i<LIFE ; i++ ){
			double depAmt;
			if (i != LIFE-1){				// to check if this is the last year of depreciation
				depAmt = currentCost*2/LIFE; // With the double-declining method of depreciation, each year the item is depreciates by 2/nths of its value at the beginning of the year.
			} 
			else{
				depAmt = currentCost;   //in the last year it is depreciated by its value at the begining of the year
			}
			TotalDep = TotalDep+depAmt;
			System.out.println(currentYear+ "		" +twoDForm.format(currentCost)+ "		" +twoDForm.format(depAmt)+ "		" +twoDForm.format(TotalDep));
			currentYear++;
			currentCost = currentCost - depAmt;
		}
			
	}


}
