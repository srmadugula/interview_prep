/**
 * interview.P007_Fibonacci.java
 *
 * Write a program to generate the Fibonacci series.
 */

package interview;

import java.util.Scanner;

public class P007_Fibonacci {

	public static void main(String [] args) {
		P007_Fibonacci obj = new P007_Fibonacci();
		System.out.print("Enter the number to generate the series: ");
		try {
			Scanner scnr = new Scanner(System.in);
			int num = Integer.parseInt(scnr.nextLine());
			obj.method1(num);
			System.out.println();
			for(int i=1; i<=num; i++) {
				System.out.print(obj.method2(i)+", ");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public void method1(int num) {
		int feb1 = 1, feb2 = 1, febonacci = 1;
		System.out.print(feb1+", "+feb2+", ");
		for(int i=3; i<=num; i++) {
			febonacci=feb1+feb2;
			System.out.print(febonacci+", ");
			feb1=feb2;
			feb2=febonacci;
		}
	}
	
	public int method2(int num) {
		if(num==1 || num==2) {
			return 1;
		}else {
			return method2(num-1)+method2(num-2);
		}
		
	}
}
