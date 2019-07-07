package multithreading;

public class P001_MultiThreading implements Runnable{

	public static void main(String [] args) {
		Thread t1 = new Thread("One");
		Thread t2 = new Thread("Two");
		t1.start();
		t2.start();
		System.out.println("Thread names are as follows: ");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
	}
	
	@Override
	public void run() {
		
	}
	
}
