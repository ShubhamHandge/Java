package day7;

public class MessageThreadImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MessageThreadImpl("ONE",1000);
		Thread t2 = new MessageThreadImpl("TWO",500);
		t1.start();
		t2.start();
		
		try {
			t1.join(); //Causes the parent thread: Main thread to wait until this thread dies 
			t2.join(); //Causes the parent thread: Main thread to wait until this thread dies 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Done, thank you.");
	}

}
