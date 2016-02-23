/**
 * @author Vishal Narayan
 * The Palindrome class contains two private instance variables and
 * two methods which both alter a string and test it through a series 
 * of conditions to check whether the string is a palindrome.
 */
import java.util.Scanner;
public class Palindrome {
	
	private String str;
	private String palin = "";
	
	
	/**
	 * Converts a string into lowercase letters
	 * @param str the given string to be altered
	 * @return palin the altered string containing all lowercase letters
	 */
	public String lower_letters(String str){
		
		
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122){
				palin += str.charAt(i);
				
			}
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90){
				char lower = str.charAt(i);
				lower += 32;
				palin += lower;
			}
				
			}
		return palin;
		}
		
	
	/**
	 * The check method checks whether given string is a palindrome
	 * @param pal the string to be checked
	 * @return bool whether or not the given string is a palindrome
	 */
	public boolean check(String pal){
		if (pal.length() == 0 || pal.length() == 1){
			return true;
		}
		if (pal.charAt(0) == pal.charAt(pal.length()-1)){
			return check(pal.substring(1 , pal.length()-1));
		}
		return false;
	}
	
}


