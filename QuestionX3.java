import java.util.*;

public class QuestionX3{

	public static void main(String[] args){
		
		System.out.println("\n**** Addition of 3 Integer Numbers ****");
		
		//Variables
		int number;
		int sum = 0;
		
		//Calling the Scanner method to let the user input a number
		Scanner sc = new Scanner(System.in);
		String st = new String();
		
		System.out.println("Enter a 3 digit number : ");
		number = sc.nextInt();
		
		if (number > 999) {
			System.out.println("Number isn't 3 digits long, Please try again ");
			return;
		}
		
		if (number < 100) {
			System.out.println("Number isn't 3 digits long, + Please try again ");
			return;
		}
		
		else {
			//Getting the sum of 3 integer digits
			while (number > 0) { 
				sum = sum + number % 10;
				number = number/10;
			}
			System.out.println("The sum of all 3 numbers are : " + sum);
		}
	}
}