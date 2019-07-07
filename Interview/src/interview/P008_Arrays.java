/**
 * interview.P008_Arrays.java
 * 
 * given two arrays which contains sorted and distinct values.  
 * Find the duplicates among them.
 * 
 * arr1 = {3,7,8,14,19,23,32,44}
 * arr2 = {8,24,27,32,44}
 * 
 */

package interview;

public class P008_Arrays {
	
	public static void main(String [] args) {
		
		P008_Arrays obj = new P008_Arrays(); 
		
		int [] arr1 = {3,7,8,14,19,23,32,44};
		int [] arr2 = {8,24,27,32,33,35,36,37,38,44};
		
		obj.mymethod1(arr1, arr2);
	}
	
	public void mymethod1(int [] arr1, int [] arr2) {
		int arr1_len = arr1.length;
		int arr2_len = arr2.length;
		
		int i=0, j=0;
		while(i<arr1_len && j<arr2_len) {
			if(arr1[i]<arr2[j]) {
				i++;
			}else if(arr1[i]>arr2[j]) {
				j++;
			}else {
				System.out.print(arr1[i]+", ");
				i++; 
				j++;
			}
		}
	}

}
