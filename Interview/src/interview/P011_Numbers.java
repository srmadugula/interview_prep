/** 
 * interview.P011_Numbers.java
 * 
 * recursively-sum-the-integers of first N numbers
 */

package interview;

import java.util.Scanner;

public class P011_Numbers {
	
	public static void main(String [] args) {
		P011_Numbers obj = new P011_Numbers();
		System.out.print("Enter the number to generate the series: ");
		try {
			Scanner scnr = new Scanner(System.in);
			int num = Integer.parseInt(scnr.nextLine());
			System.out.println(obj.method1(num));
		}catch(Exception e) {
		System.out.println(e);
		}
	}
	
	public int method1(int num) {
		if(num==0) return 0;
		else {
			return num + method1(num-1);
		}
	}
	
}
