/** 
 * interview.P006_Palindrome.java
 * 
 * write a program to find whether the given word is Palindrome or not
 */
package interview;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P006_Palindrome {
	
	public static void main(String [] args) 
		throws IOException{
		
		P006_Palindrome obj = new P006_Palindrome();
		BufferedReader br = null;
		String word = null;
		System.out.print("Please enter the word to be tested: ");
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			word = br.readLine();
			System.out.println("Given word is a Palindrome-method1: "+obj.mymethod1(word));
			System.out.println("Given word is a Palindrome-method2: "+obj.mymethod2(word));
		}catch(Exception e) {
			System.out.println(e);
		}
				
	}
	
	public Boolean mymethod1(String word) {
		StringBuilder sb = new StringBuilder(word);
		return word.equals(sb.reverse().toString());
	}

	public Boolean mymethod2(String word) {
		int len = word.length();
		String newWord = "";
		for(int i=len-1; i>=0; i--) {
			newWord=newWord+word.charAt(i);
		}
		
		return word.equals(newWord);
	}
}
