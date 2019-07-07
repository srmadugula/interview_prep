/**
 * interview.P014_Strings
 * 
 * Strings - List the Strings passed in the main program by reversing them * 
 */

package interview;

public class P014_Strings {
	
	public static void main(String [] args) {
		
		for(String a: args) {
			System.out.println(new StringBuilder(a.toString()).reverse().toString());
		}
	}

}
