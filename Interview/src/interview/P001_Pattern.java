/**
 * interview.P001_Pattern.java
 * 
 * n = 50
 * Print below pattren
 * [(10,), (10,20),(10,20,30),(10,20,30,40),(10,20,30,40,50)]
 *  
 */
package interview;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P001_Pattern {

	public static void main(String [] args) throws IOException{
		
		P001_Pattern obj = new P001_Pattern();
		BufferedReader br = null;
		System.out.print("Please enter the number to generate the pattern: ");
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			obj.mymethod1(num);
		}catch(IOException ne) {
			ne.printStackTrace();
		}
	}
	
	public void mymethod1(int num) {
		for(int i=1; i<=num/10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print((j*10)+", ");
			}
			System.out.println();
		}
	}
}
