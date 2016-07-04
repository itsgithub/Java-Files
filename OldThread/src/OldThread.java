class Demo extends Thread {
	Demo (){
		super("Demo Thread");
		System.out.println("Child thread:" + this);
		start();
		}
	public void run(){
		try {
			for(int i = 5; i>0; i--){
				System.out.println("Child thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Exiting child thread");
	}
}
 class OldThread {
	public static void main(String args[]){
		new Demo();
		try {
			for(int i = 5; i>0; i--){
				System.out.println("main thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Exiting the main thread");
	}
}
