package datastructures;

public class P007_MergeSort {
	
	private int [] array;
	private int [] tempMergArr;
	private int length;
	
	public static void main(String [] args) {
		
		P007_MergeSort obj = new P007_MergeSort();
		int [] arr = {45,23,11,89,77,98,4,28,65,43};
		obj.mymethod1(arr);
		for(int i: arr) {
			System.out.print(i+", ");
		}
		
	}

	public void mymethod1(int [] arr) {
		this.array = arr;
		this.length = arr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length-1);
	}
	
	private void doMergeSort(int lowerIndex, int higherIndex) {
		if(lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex)/2;
			doMergeSort(lowerIndex, middle);
			doMergeSort(middle+1, higherIndex);
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}
	
	private void mergeParts(int lowerIndex, int middle, int higherIndex) {
		for(int i=lowerIndex; i<=higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		
		while(i<=middle && j<=higherIndex) {
			if(tempMergArr[i]<=tempMergArr[j]) {
				array[k]=tempMergArr[i];
				i++;
			}else {
				array[k]=tempMergArr[j];
				j++;
			}
			k++;
		}
		
		while(i<=middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}
	}
}
