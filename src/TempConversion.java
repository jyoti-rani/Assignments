import java.util.Scanner;

public class TempConversion {

	public void convert() {
		float c, f;
	    c = f = 0;
		Scanner S = new Scanner(System.in);
	    System.out.println("Enter a temperature reading in Centigrade : ");
		c = S.nextFloat();
		System.out.println("Enter a temperature reading in Fahrenheit : ");
		f = S.nextFloat();
	    convertCtoFAndPrint(c);
	    convertFtoCAndPrint(f);
	    return;
	}
	
	public static void convertCtoFAndPrint(float inputCentigrade){
		//System.out.println("Enter a temperature reading in Centigrade : ");
		//Scanner S1 = new Scanner(System.in);
		//inputCentigrade = S1.nextFloat();
		float outputinFahrenheit = (float) (32 + inputCentigrade * (180.0/100.0));
		System.out.println("Temperature in Fahrenheit is : " + String.format("%.2f",outputinFahrenheit));
	}
	
	public static void convertFtoCAndPrint(float inputFahrenheit){
		//System.out.println("Enter a temperature reading in Fahrenheit : ");
		//Scanner S2 = new Scanner(System.in);
		//inputFahrenheit = S2.nextFloat();
		float outputinCentigrade = (float) ((float) (inputFahrenheit - 32) * (100.0/180.0));
		System.out.println("Temperature in Centigrade is : " + String.format("%.2f",outputinCentigrade));
	}
}
