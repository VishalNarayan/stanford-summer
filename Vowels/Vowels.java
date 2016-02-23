/**
 * @author Vishal Narayan
 * The Vowels class reads an input text file, then prints out the contents of the text file.
 * It then replaces all the spaces with tildes, and counts the amount of each of the vowels 
 * in the input text file. It then puts these in an output text file.
 */
package letterGame;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Vowels {
	
	public static void main(String[] args){
		String str = new String();
		String line = new String();
		int a=0, e=0, i=0, o=0, u=0;
		try {
			Scanner in;
			in = new Scanner(new File("poetry.txt"));
			FileWriter vowel = new FileWriter("vowelsOut.txt");
			while (in.hasNextLine()){
				line = in.nextLine();
				System.out.println(line);
				line = line.replaceAll(" ", "~");
				String A = line.replaceAll("[^Aa]", "");
				a += A.length();
				
				String E = line.replaceAll("[^Ee]", "");
				e += E.length();
				
				String I = line.replaceAll("[^Ii]", "");
				i += I.length();
				
				String O = line.replaceAll("[^Oo]", "");
				o += O.length();
				
				String U = line.replaceAll("[^Uu]", "");
				u += U.length();
				
				vowel.write(line);
				
			}
			vowel.write(System.getProperty("line.separator"));
			vowel.write("Number of A's: " + a + System.getProperty("line.separator"));
			vowel.write("Number of E's: " + e + System.getProperty("line.separator"));
			vowel.write("Number of I's: " + i + System.getProperty("line.separator"));
			vowel.write("Number of O's: " + o + System.getProperty("line.separator"));
			vowel.write("Number of U's: " + u + System.getProperty("line.separator"));
			
			vowel.close();
		}catch(IOException q){
			System.out.println("Error " + q.getMessage());
		}
	}
}
	
