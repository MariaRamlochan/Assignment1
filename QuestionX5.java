import java.util.*;

public class QuestionX5{

	public static void main(String[] args){

		System.out.println("\n**** Calculator ****");
		//Variables
		
		Random random = new Random();
		int num1 = random.nextInt(100);	
		System.out.println("Random number is: " + num1);
		
		
		double expo2 = Math.pow(num1,2);
		System.out.println("The power 2 of " + num1 + " is: " + expo2);
		
		double expo3 = Math.pow(num1,3);
		System.out.println("The power 3 of " + num1 + " is: " + expo3);
		
		double sqrt = Math.sqrt(num1);
		System.out.println("The square root of " + num1 + " is: " + sqrt);
		
		double naturalLog = Math.log(num1);
		System.out.println("The natural log of " + num1 + " is: " + naturalLog);
		
		double log10 = Math.log10(num1);
		System.out.println("The base 10 log of " + num1 + " is: " + log10);
	}
}