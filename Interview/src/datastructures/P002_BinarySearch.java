/*
 * BinarySearch using divide and conquer
 */

package datastructures;

public class P002_BinarySearch {

	public static void main(String [] args) {
		
		P002_BinarySearch obj = new P002_BinarySearch();
		
		int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
		System.out.println("Key 14's position "+obj.mymethod1(arr, 14));
		
		int[] arr1 = {6,34,78,123,432,900};
		System.out.println("Key 432's position "+obj.mymethod1(arr1,432));
		
	}
	
	public int mymethod1(int [] arr, int key) {
		
		int start=0; 
		int end=arr.length-1;
		
		while(start<=end) {
			//int mid = (start+end)/2;
			int mid = start+(end-start)/2;
			if(key==arr[mid]) return mid;
			if(key<arr[mid]) end=mid-1;
			else start=mid+1;
		}
		return -1;
		
	}
}
