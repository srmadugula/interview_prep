package datastructures;

public class P005_InsertionSort {

	public static void main(String [] args) {
		P005_InsertionSort obj = new P005_InsertionSort();
		int [] arr = {10,34,2,56,7,67,88,42};
		int [] res = obj.mymethod1(arr);
		for(int i: res) {
			System.out.print(i+", ");
		}
	}
	
	public int [] mymethod1(int [] arr) {
		
		int len = arr.length, temp=0, cnt=0;
		for(int i=0; i<len; i++) {
			for(int j=i; j>0; j--) {
				cnt++;
				if(arr[j]<arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		System.out.println(cnt);
		return arr;
	}
	
}
