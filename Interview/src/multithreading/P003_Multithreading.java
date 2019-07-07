package multithreading;

public class P003_Multithreading implements Runnable{
	
	@Override
	public void run() {
		
	}
	
	public static void main(String [] args) {
		Thread t1 = new Thread("one");
		Thread t2 = new Thread("two");
		
		t1.start();
		t2.start();
		
		System.out.println("Names of the Threads are as follows: ");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
	}
	

}
