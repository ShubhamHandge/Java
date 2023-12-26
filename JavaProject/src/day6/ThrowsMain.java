package day6;

public class ThrowsMain {

	private static void print() throws Exception {
		//This method tells compiler that it may fire an exception: Exception but not willing to handle it.
				//It enforces its caller to handle it.	
	}
	
	private static void Display()  {
		//This method fulfills compiler's requirement i.e. it handles the exception: Exception
		try {
			print();
		} catch (Exception ex) {
	
		}
	}
	
	private static void Show() throws Exception {
		//This method further delegates the responsibility of handling the exception: Exception to its caller
		print();
	}
	
	
	public static void main(String[] args) {
		Display();
		
		// TODO Auto-generated method stub
		try {
			Show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
