package day6;

public class MultipleExceptionHandlerMain {

	public static void main(String[] args) {
		// This program accepts 2 numbers as Command Line Arguments and prints their sum
		try {
		int x  = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int result = x / y;
		System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Enter At Least two numbers");
			
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Enter Second Number Non-Zero");
			
		}
	}
	

}
