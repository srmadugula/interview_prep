package datastructures;

public class P006_SelectionSort {
	
	public static void main(String [] args) {
		
		P006_SelectionSort obj = new P006_SelectionSort();
		int [] arr1 = {10,34,2,56,7,67,88,42};
		int [] res = obj.mymethod1(arr1);
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+", ");
		}
	}
	
	public int [] mymethod1(int [] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			int index = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[index]) index = j;
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		
		return arr;
	}

}
