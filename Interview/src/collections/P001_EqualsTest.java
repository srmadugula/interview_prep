package collections;

public class P001_EqualsTest {

	public static void main(String [] args) {
		
		Moof one = new Moof(8);
		Moof two = new Moof(8);
		
		if(one.equals(two)) System.out.println("one and two are equal objects");
	}
}

class Moof{
	
	private int moofVal;
	
	Moof(int moofVal){
		this.moofVal = moofVal;
	}
	
	public int getMoofVal() {
		return this.moofVal;
	}
	
	public boolean equals(Object obj) {
		if((obj instanceof Moof) && (((Moof)obj).getMoofVal() == this.moofVal))
			return true;
		else 
			return false;
	}
	
}