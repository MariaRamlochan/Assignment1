import java.util.*;

public class QuestionX1{

	public static void main(String[] args){

		System.out.println("\n**** Calculator for a Roadtrip ****");
		//Variables
		double killometers;
		double distance_per_liter;
		final double PRICE_PER_LITER = 1.16;
		double TotalGas;


		Scanner sc = new Scanner(System.in);
		String st = new String();
		
		System.out.println("How many killometers travelled : ");
		killometers = sc.nextDouble();
		//For testing : killometers = sc.nextDouble(70);
		
		System.out.println("How many distance does the vehicle run for 1 liter of gas : ");
		distance_per_liter = sc.nextDouble();
		//For testing : distance_per_liter = sc.nextDouble(5);
		
		//Getting the total gas price by dividing the killometers by distance_per_liter then multiply it by the PRICE_PER_LITER
		TotalGas = killometers/distance_per_liter * PRICE_PER_LITER;
		
		System.out.println("Total gas is in CAD: ");
		System.out.printf("%.2f", TotalGas); 
		System.out.print("$.\n\n");
	
 
	}
}