package Threading;

public class ThreadDemo1 implements Runnable {
	// every thread class implements runnable; default overrides the method.
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		//Starting a thread
		ThreadDemo1 t1 = new ThreadDemo1();
		Thread t = new Thread(t1);
		t.start();
		System.out.println(Thread.activeCount());
		
		/*
		 * once thread is created it is runnable state which is ready to use.
		 * after calling the thread using .start()- runs
		 * blocking threads:
		 * sleep() - a time that thread can be in blocked state
		 * suspend() - when it is unavailable , put into blocked state
		 * notify()- notifying other thread to start
		 * i/o blocking - using needed resources by other thread
		 * Stop() - thread logic is finished, but exists in memory
		 * dead state- t.join - all the child threads get collected and ready for garbage collection.
		 * 
		 */
		
		}
	}
}