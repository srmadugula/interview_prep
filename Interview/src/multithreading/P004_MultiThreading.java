package multithreading;

public class P004_MultiThreading {

	public static void main(String [] args) {
		MyThread t1 = new MyThread("TT11");
		MyThread t2 = new MyThread("TT22");
		t1.start();
		t2.start();
	}
}

class MyThread implements Runnable{
	Thread mythd;
	private String mythdnm;
	
	MyThread(String mythdnm){
		this.mythdnm = mythdnm;
	}
	
	@Override 
	public void run(){
		
		System.out.println("Thread started running "+mythdnm);
		
		for(int i=0; i<7; i++) {
			System.out.println(i);
			System.out.println(mythdnm);
			
			try {
				Thread.sleep(1500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
	
	public void start() {
		System.out.println("Thread has started");
		if(mythd == null) {
			mythd = new Thread(this, mythdnm);
			mythd.start();
		}
	}
}