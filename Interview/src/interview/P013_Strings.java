/**
 * interview.P013_Strings
 * 
 * Write the code to (adyecaddxzswekhabced…) use this string to generate a String which doesn't
 * have duplicated characters, without changing the order.
 */

package interview;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class P013_Strings {
	
	public static void main(String [] args) {
		
		String givenString = "adyecaddxzswekhabced";
		
		P013_Strings obj = new P013_Strings();
		System.out.println("Desired output String is --> "+obj.myMethod1(givenString));
	}

	public String myMethod1(String givenString) {
		Set<Character> st = new LinkedHashSet<Character>();
		char [] charr = givenString.toCharArray();
		for(char ch: charr) {
			st.add(ch);
		}
		
		Iterator<Character> itr = st.iterator();
		StringBuilder sbr = new StringBuilder();
		while(itr.hasNext()) {
			sbr.append(itr.next().toString());
		}
		
		return sbr.toString();
		
	}
}
