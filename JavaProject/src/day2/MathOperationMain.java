package day2;
//This example illustrates the use of static block and gloabal variable

public class MathOperationMain {

	static {
		System.out.println("Demonstrating static block and global variables.");
	}
	
	public static void main(String[] args) {
		System.out.println("PI Values: " + MathOperation.PI);
		System.out.println(MathOperation.doAdd(14, 4));
		System.out.println(MathOperation.doSubtract(10, 50));

	}

}
