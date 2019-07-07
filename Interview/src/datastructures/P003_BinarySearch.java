/*
 * Binary Search using recursion
 */

package datastructures;

public class P003_BinarySearch {
	
	public static void main(String [] args) {
		P003_BinarySearch obj = new P003_BinarySearch();
		int[] arr1 = {2,45,234,567,876,900,976,999};
        
		int index = obj.mymethod1(arr1,0,arr1.length,45);
        System.out.println("Found 45 at "+index+" index");
        
        index = obj.mymethod1(arr1,0,arr1.length,999);
        System.out.println("Found 999 at "+index+" index");
        
        index = obj.mymethod1(arr1,0,arr1.length,876);
        System.out.println("Found 876 at "+index+" index");
	}
	
	public int mymethod1(int [] arr, int start, int end, int key) {
		
		if(start<end) {
			int mid = start + (end-start)/2;
			if(key<arr[mid]) {
				return mymethod1(arr, start, mid, key);
			}else if(key>arr[mid]) {
				return mymethod1(arr, mid+1, end, key);
			}else {
				return mid;
			}
		}
		return -(start+1);
	}
	
}
