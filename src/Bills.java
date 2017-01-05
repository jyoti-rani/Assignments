import java.util.Scanner;

public class Bills {
	  
	public void CalculateBill(){ 
	//public static void main (String[] args){
		int noTV = 0;
		int noVCR = 0;
		int noRemoteControl = 0;
		int noCDPlayer = 0;
		int noTapeRecorder = 0;
		
		// Getting quantity of each item sold
		Scanner S = new Scanner(System.in);
		System.out.print("Enter the quantity of TVs sold: ");
		noTV = S.nextInt();
		
		System.out.print("Enter the quantity of VCRs sold: ");
		noVCR = S.nextInt();
		
		System.out.print("Enter the quantity of remote controls sold: ");
		noRemoteControl = S.nextInt();
		
		System.out.print("Enter the quantity of CD players sold: ");
		noCDPlayer = S.nextInt();
		
		System.out.print("Enter the quantity of tape recorders sold: ");
		noTapeRecorder = S.nextInt();

		//Setting constant values for Unit prices and Tax Rate
		float TVUnitPrice = 400.00f;
		//TVUnitPrice = String.format("%.2f", TVUnitPrice);
		float VCRUnitPrice = 220.00f;
		float RemoteControlUnitPrice = 35.20f;
		float CDPlayerUnitPrice = 300.00f;
		float TapeRecorderUnitPrice = 150.00f;
		float TaxRate = 8.25f;
		
		//Calculating total Price of each product
		float totalTVPrice = TVUnitPrice * noTV;
		float totalVCRPrice = VCRUnitPrice * noVCR;
		float totalRemoteControlPrice = RemoteControlUnitPrice * noRemoteControl;
		float totalCDPlayerPrice = CDPlayerUnitPrice * noCDPlayer;
		float totalTapeRecorderPrice = TapeRecorderUnitPrice * noTapeRecorder;
		
		//Calculating Subtotal 
		float subTotal = totalTVPrice + totalVCRPrice + totalRemoteControlPrice + totalCDPlayerPrice + totalTapeRecorderPrice;
		float totalTax = (subTotal * TaxRate) / 100;
		float total = subTotal + totalTax;
		
		//Print the Output
		System.out.println("   ");
		System.out.println("QTY   DESC           PRICE      TOTAL" );
		System.out.println(" " + noTV+ "    Television     $" +String.format("%.2f", TVUnitPrice)+ "    $" +String.format("%.2f", totalTVPrice));
		System.out.println(" " + noVCR+ "    VCR            $" +String.format("%.2f", VCRUnitPrice)+ "    $" +String.format("%.2f", totalVCRPrice));
		System.out.println(" " + noRemoteControl+ "    Remote Control $" +String.format("%.2f", RemoteControlUnitPrice)+ "     $" +String.format("%.2f", totalRemoteControlPrice));
		System.out.println(" " + noCDPlayer+ "    CD Player      $" +String.format("%.2f", CDPlayerUnitPrice)+ "    $" +String.format("%.2f", totalCDPlayerPrice));
		System.out.println(" " + noTapeRecorder+ "    Tape Recorder  $" +String.format("%.2f", TapeRecorderUnitPrice)+ "    $" +String.format("%.2f", totalTapeRecorderPrice));
		System.out.println("   ");
		System.out.println("                   Subtotal:  $" +String.format("%.2f", subTotal));
		System.out.println("                Tax (8.25%):   $" +String.format("%.2f", totalTax));
		System.out.println("                      Total:  $" +String.format("%.2f", total));
	
		return;
	}
	
	
}