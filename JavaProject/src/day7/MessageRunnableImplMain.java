package day7;

public class MessageRunnableImplMain {

	public static void main(String[] args) {
		Runnable r1 = new MessageRunnableImpl("heyyy", 1000);
		Runnable r2 = new MessageRunnableImpl("What's Up", 500);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
