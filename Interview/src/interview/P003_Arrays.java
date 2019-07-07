/**
 * interview.P003_Arrays.java
 * 
 * given List = [4,2,10,4,30,50,33,4,1,2,4]
 * count of each element in the list
 *
 */
package interview;

import java.util.Set;
import java.util.Map.Entry;
import java.util.HashMap;


public class P003_Arrays {
	
	public static void main(String [] args) {
		int [] myArr = {4,2,10,4,30,50,33,4,1,2,4};
		P003_Arrays obj = new P003_Arrays();
		obj.mymethod1(myArr);
	}
	
	public void mymethod1(int [] myArr) {
		HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		
		for(int i=0; i<myArr.length; i++) {
			if(myMap.containsKey(myArr[i])) {
				myMap.put(myArr[i], myMap.get(myArr[i])+1);
			}else {
				myMap.put(myArr[i], 1);
			}
		}
		
		//display the elements of myMap
		Set<Entry<Integer, Integer>> entrySet = myMap.entrySet();
		
		for(Entry<Integer, Integer> entry: entrySet) {
			System.out.println(entry.getKey()+", "+entry.getValue());
		}
	}
	
	
}
