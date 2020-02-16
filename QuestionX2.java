import java.util.*;

public class QuestionX2{

	public static void main(String[] args){

		System.out.println("\n**** CALCULATING TPS AND TVQ WITH 15% TIP ****");
		//Variables
		double price;
		final double TPS = 0.05;
		final double TVQ = 0.09975;
		final double TIPS = 0.15;
		double totalPrice;
		double total;
		
		Scanner sc = new Scanner(System.in);
		String st = new String();
		
		System.out.println("Enter price ammount : ");
		price = sc .nextDouble();
		
		//Adding the percentage of tax on the original price, then adding the tips to the overal <totalPrice>"
		totalPrice = price + (price * (TPS + TVQ));
		total = totalPrice + (totalPrice * TIPS);
		
		System.out.println("Total plus tax and 15% tip will be : ");
		System.out.printf("%.2f", total); 
		
		//Making the $ symbole appear at the end of total
		System.out.print("$.\n\n");
	
	}
}