/**
 * interview.P009_Strings.java
 * 
 * Write the code to (adyecaddxzswekhabced…) use this string to generate a string 
 * which doesn't have duplicated characters, without changing the order.
 * 
 */

package interview;

public class P009_Strings {

	public static void main(String [] args) {
		String stringWithDuplicates = "afsjeadrffafvgdefeverhfgberAAad";
		char[] characters = stringWithDuplicates.toCharArray();
		boolean[] found = new boolean[256];
		StringBuilder sb = new StringBuilder();
		System.out.println("String with duplicates : " + stringWithDuplicates);
		for (char c : characters) {
			System.out.println(c);
			System.out.println(found[c]);
			if (!found[c]) {
			    found[c] = true;
			    sb.append(c);
			}
			System.out.println(found[c]);
		}
		System.out.println("String after duplicates removed : " + sb.toString());
		for(int i=0; i<20; i++) {
			System.out.println(found[i]);
		}
	}
	
}
