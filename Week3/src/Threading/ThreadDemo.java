package Threading;


public class ThreadDemo extends Thread {
	// every thread class implements runnable; default overrides the method.
	//runnable - parent ; 
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		ThreadDemo t1 = new ThreadDemo();
		t1.start(); // thread 1 get started by jvm
		t1.setName("Java-1");
		
		ThreadDemo t2 = new ThreadDemo();
		t2.start(); // run
		t2.setName("Java-2");
		
		
		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.activeCount());
	}

}
