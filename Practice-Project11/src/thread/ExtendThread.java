package thread;


public class ExtendThread extends Thread {
	
	//method over loading
	public void run() {
		System.out.println("thread Started");
	}
	
	public static void main(String[] args) {
		
		ExtendThread t1= new ExtendThread();
		ExtendThread t2= new  ExtendThread();
		
		t1.start();
		t2.start();
	}

}
