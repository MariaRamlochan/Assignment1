import java.util.*;

public class QuestionX4{

	public static void main(String[] args){

	System.out.println("\n**** Valid URL ****");
	//Variables
	String URL = new String();
	
	Scanner sc = new Scanner(System.in);
	String st = new String();
	
	URL = sc.nextLine();
	
	URL = URL.replaceAll(" ","");
	System.out.println(URL);
	
	 System.out.println("Verifying an URL with : " + URL.length() + " characters");
	 System.out.println("Is this a valid and secure");
	  if(URL.startsWith("https://") == true){
		  System.out.println("true");
	  }
	  else{
		  System.out.println("false");
		  
	  }
	}
}