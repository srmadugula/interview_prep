/**
 * interview.P005_Arrays.java
 *
 * write a program to find the second largest element in an Array.
 */

package interview;

import java.util.Arrays;

public class P005_Arrays {

	public static void main(String[] args) {
		P005_Arrays obj = new P005_Arrays();
		int [] arr = new int[8];
		arr[0] = 30;
		arr[1] = 10;
		arr[2] = 20;
		arr[3] = 60;
		arr[4] = 40;
		arr[5] = 90;
		arr[6] = 100;
		arr[7] = 70;
		
		int [] arr2 = obj.mymethod1(arr);
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		
		System.out.println("\n2nd largest element from 2nd method: "+obj.mymethod2(arr));
	}
	
	public int[] mymethod1(int[] arr) {
		Arrays.sort(arr);
		System.out.println("2nd element of the array "+arr[arr.length-2]);
		return arr;
	}
	
	public int mymethod2(int [] arr) {
		int tmp;
		//sort the array
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		
		return arr[1];
	}
}
