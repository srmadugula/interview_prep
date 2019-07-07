package datastructures;

public class P001_LinearSearch {
	
	public static void main(String [] args) {
		
		P001_LinearSearch obj = new P001_LinearSearch();
		
		int[] arr1= {23,45,21,55,234,1,34,90};
		int searchKey = 34;
		System.out.println("Key "+searchKey+" found at index: "+obj.mymethod1(arr1, searchKey));
		int[] arr2= {123,445,421,595,2134,41,304,190};
		searchKey=421;
		System.out.println("Key "+searchKey+" found at index: "+obj.mymethod1(arr1, searchKey));
		
	}

	
	public int mymethod1(int [] arr, int searchKey) {
		int index=-1;
		
		for(int i=0; i<arr.length; i++) {
			if(searchKey == arr[i]) {
				index = i;
			}
		}
		
		return index;
		
	}
	
	
}
