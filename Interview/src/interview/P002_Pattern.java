/**
 * interview.P002_Pattern.java
 * 
 * list = [5,34,66,21,7,1002,48,59,22,71,54,100,44,24,35]
 * sum = 88
 * Result= [(34,54),(66,22),(44,44)]
 * 
 */

package interview;

public class P002_Pattern {
	
	public static void main(String [] args) {
		int [] myArr = {5,34,66,21,7,1002,48,59,22,71,54,100,44,24,35};
		int sum = 88;
		P002_Pattern obj = new P002_Pattern();
		obj.mymethod1(myArr, sum);
	}
	
	public void mymethod1(int[] myArr, int sum) {
		int len = myArr.length;
		for(int i=0; i<len; i++) {
			for(int j=i; j<len; j++) {
				if(sum == myArr[i]+myArr[j]) {
					System.out.print("("+myArr[i]+","+myArr[j]+")"+",  ");
				}
			}
		}
	}

}
