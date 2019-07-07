/**
 * interview.P012_Strings.java
 * 
 * Replace the vowels in the given string in the reverse order
 * Input = "Hi Srinu, Welcome, It's Cisco."
 * Vowels = [i,i,u,e,o,e,I,i,o]
 * Output = "Ho SrinI, Welcome, ut's Cisci."
 * 
 */

package interview;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P012_Strings {

	public static void main(String [] args) throws IOException{
		
		P012_Strings obj = new P012_Strings();
		String givenString = null, returnString=null;
		BufferedReader br = null;
		
		System.out.print("Please enter the String to be processed: ");
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			givenString = br.readLine();
			System.out.println("\n"+obj.mymethod1(givenString));
			
		}catch(IOException e) {
			System.out.println("Encounted IOException "+e);
		}
	}
	
	
	public String mymethod1(String givenString) {
		String returnString = null;
		
		char [] givenarr = givenString.toCharArray();
		ArrayList<Character> myvowelslist = new ArrayList<Character>();
		ArrayList<Character> vowelslist = new ArrayList<Character>();
		vowelslist.add('a');
		vowelslist.add('e');
		vowelslist.add('i');
		vowelslist.add('o');
		vowelslist.add('u');
		vowelslist.add('A');
		vowelslist.add('E');
		vowelslist.add('I');
		vowelslist.add('O');
		vowelslist.add('U');
		
		
		for(char ch: givenarr) {
				if(vowelslist.contains(ch)) {
					myvowelslist.add(ch);
				}
		}
		
		System.out.println(myvowelslist);
		System.out.println(myvowelslist.size());
		
		int vowelcnt = 0;
		int voweltot = myvowelslist.size();
		
		System.out.println(voweltot);
		
		for(int i=0; i<givenarr.length; i++) { 
			if(vowelslist.contains(givenarr[i])) {
				vowelcnt++;
				System.out.print(myvowelslist.get(voweltot-vowelcnt));
			}else {
				System.out.print(givenarr[i]);
			}
		}
		
		return returnString;
	}
	
}
