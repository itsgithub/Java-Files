class NewThread implements Runnable{
	Thread t;
	
	NewThread(){
		t = new Thread(this, "Demo Thread");
		System.out.println("Child Thread: " +t);
		t.start();
	}
	
	public void run() {
		try {
			for(int i=5; i>0; i--){
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("The child thread is interrupted");
		}
		System.out.println("Exiting Child Thread");
	}
	
}

class ThreadDemo {
	public static void main(String args[]){
		new NewThread();
		try {
			for(int i=5; i>0; i--){
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("The main thread is interrupted");
		}
		System.out.println("Exiting main Thread");
	}
}