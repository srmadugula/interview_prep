/**
 * interview.P010_Arrays.java
 * 
 * recursively-sum-the-integers-in-an-array
 * 
 */

package interview;

public class P010_Arrays {
	public static void main(String [] args) {
		P010_Arrays obj = new P010_Arrays();
		int[] a = { 1, 2, 3, 4, 5 };
		int sum = obj.sumOfArray(a, a.length-1);
		System.out.println(sum);
	}
	
	public int sumOfArray(int[] a, int n) {
	    if (n == 0)
	        return a[n];
	    else
	        return a[n] + sumOfArray(a, n-1);
	}
}