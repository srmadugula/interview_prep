package datastructures;

public class P004_BubbleSort {
	
	public static void main(String [] args) {
		P004_BubbleSort obj = new P004_BubbleSort();
		
		int [] arr = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		int [] res = obj.mymethod1(arr);
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+", ");
		}
		
	}
	
	public int[] mymethod1(int [] arr) {
		int len = arr.length, temp;
				
		for(int i=len-1; i>=0; i--) {
			for(int j=0; j<=i-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
	

}
