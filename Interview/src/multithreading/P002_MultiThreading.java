package multithreading;

public class P002_MultiThreading implements Runnable {

	@Override
	public void run() {
		
	}
	
	public static void main(String [] args) {
		Thread t1 = new Thread();
		t1.start();
		try {
			t1.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.setPriority(2);
		int t1Priority = t1.getPriority();
		System.out.println(t1Priority);
		System.out.println("Thread Running");
	}
	
}
