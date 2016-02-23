/**
 * @author Vishal Narayan
 * The PalindromeTester class uses the Palindrome class to check whether 
 * a user-given string is a palindrome. This goes on until the user enters q,
 * upon which the program stops.
 */
import java.util.Scanner;

public class PalindromeTester {

	public static void main(String[] args) {
		System.out.println("Welcome to the Palindrome Program! Enter the letter 'q' when you are done.");
		Scanner input = new Scanner(System.in);
	
		String str = "";
		
		//runs while user has not entered 'q' and stopped the program
		while(!str.equals("q")) {
		System.out.println("Enter a string: ");
		
		str = input.nextLine();//Accepts a user-inputed string
		
		Palindrome pal = new Palindrome();
		String palindrome = pal.lower_letters(str);
		
		if (pal.check(palindrome)){
			if (str.length() == 0 || str.length() == 1){
				if(str.equals("q")){
					System.out.println();
				}
				else{
				System.out.println("No, the string " + str + " is NOT a palindrome.");
				}
			}
			
			else{
			System.out.println("Yes, the string " + str + " is a palindrome.");
			}
		}
		else{
			System.out.println("No, the string " + str + " is NOT a palindrome.");
		}

		} 
		
		
	}

}
