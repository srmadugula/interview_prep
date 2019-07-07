/** 
 * interview.P004_List.java
 * 
 * write a program to find the second largest element in a list.
 */

package interview;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class P004_List {

	public static void main(String [] args) {
		P004_List obj = new P004_List();
		List<Integer> lst = new ArrayList<Integer>();
		
		lst.add(90);
		lst.add(30);
		lst.add(60);
		lst.add(20);
		lst.add(70);
		lst.add(30);
		lst.add(50);
		lst.add(40);
		
		List<Integer> newlst = obj.myMethod1(lst);
		
		Iterator itr = newlst.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public List<Integer> myMethod1(List<Integer> lst){
		Collections.sort(lst);
		System.out.println("Second largest element: "+lst.get(lst.size()-2));
		return lst;
		
	}
}
