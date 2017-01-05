import java.util.Scanner;

public class SelectAssignment {

	public static void main(String[] args) {
		String decision;
		String yes = "y";
		Scanner S = new Scanner(System.in);
		
		do{
			//Select Assignment number
		System.out.println("Please choose the Assignment Number from these:");
		System.out.println("1: Create Customer's Bill for a company");
		System.out.println("2: Temperature Conversion");
		System.out.println("3: Show depreciated value using different methods of depreciation");
		System.out.println("4: Coin Toss");
		
		int Choice = S.nextInt();
		switch(Choice){
		case 1:
			Bills B = new Bills();
			B.CalculateBill();
			break;
			
		case 2:
			TempConversion T = new TempConversion();
			T.convert();
			break;
			
		case 3:
			Depreciation D = new Depreciation();
			D.calculateDepreciation();
			break;
			
		case 4:
			CoinToss CT = new CoinToss();
			CT.toss();
			break;
			
		}
		System.out.println("Do you want to check another assignement? : y/n");
		decision = S.next();
		} while(decision.equals(yes)); 
		
		System.out.println("Thank You. Have a nice day !!");
		// Close the scanner
		S.close();	
	}

}
