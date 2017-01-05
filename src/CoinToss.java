import java.util.Random;
import java.util.Scanner;

public class CoinToss {
	
	private enum Side{Heads, Tails};
	    
  //Constructor to get the initial side before Toss
    CoinToss(){			
  		Side initialSide = getSideUp();
  		System.out.println("Initial up side of the coint is " +initialSide);
  	}
  	
  	//To get the Side up of the coin
    public Side getSideUp(){
    	Side sideUp = null;
    	Random newToss = new Random();
    	int result = newToss.nextInt(2);   //Getting random Toss
    	if (result == 0){
    		sideUp = Side.Heads; 
    	}
    	if (result == 1){
    		sideUp = Side.Tails; 
    	}
    	return sideUp;
    }
    
    // toss
	public void toss(){
		System.out.print("How many toss you want? : ");
		Scanner S = new Scanner(System.in);
		int choice = S.nextInt();						// Asking user for no. of Toss required
		System.out.println("Strating the Toss:");
		int numberOfHeads = 0;
		int numberOfTails = 0;
		for (int i=1 ; i<=choice ; i++){
			Side tossResult = getSideUp();				//Getting random Toss
			if (tossResult == Side.Heads){
				numberOfHeads++;
				System.out.println(i+": You flipped Heads !!");
			}
			if (tossResult == Side.Tails){
				numberOfTails++;
				System.out.println(i+": You flipped Tails !!");
			}
				
		}
		System.out.println("Number of times Heads is facing up: " +numberOfHeads); // Printing total no. of Heads
		System.out.println("Number of times Tails is facing up: " +numberOfTails); //Printing total no. of Tails
		
	}

}
