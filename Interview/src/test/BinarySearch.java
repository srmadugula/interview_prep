package test;

public class BinarySearch {

	public static void main(String [] args) {
		
		BinarySearch obj = new BinarySearch();
		int[] arr1 = {2,45,234,567,876,900,976,999};
		int searchkey = 900;
		System.out.println("Index of "+searchkey+" in the given arr is "+obj.mymethod1(arr1,0,arr1.length, searchkey));
	}
	
	public int mymethod1(int [] arr1, int start, int end, int searchkey) {
		
		if(start<end) {
			int mid = start+(end-start)/2;
			if(searchkey < arr1[mid]) {
				return mymethod1(arr1, start, mid, searchkey);
			}else if(searchkey > arr1[mid]) {
				return mymethod1(arr1, mid+1, end, searchkey);
			}else return mid;
		}
		
		return -1;
	}

}
